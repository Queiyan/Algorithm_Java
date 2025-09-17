package com.algorithm;

/**
 * Search algorithms commonly used in coding tests
 */
public class SearchAlgorithms {
    
    /**
     * Linear search algorithm
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int linearSearch(int[] arr, int target) {
        if (arr == null) {
            return -1;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Not found
    }
    
    /**
     * Binary search algorithm (requires sorted array)
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public int binarySearch(int[] arr, int target) {
        if (arr == null) {
            return -1;
        }
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1; // Not found
    }
    
    /**
     * Recursive binary search
     * Time Complexity: O(log n)
     * Space Complexity: O(log n) due to recursion
     */
    public int binarySearchRecursive(int[] arr, int target) {
        if (arr == null) {
            return -1;
        }
        return binarySearchRecursiveHelper(arr, target, 0, arr.length - 1);
    }
    
    private int binarySearchRecursiveHelper(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRecursiveHelper(arr, target, mid + 1, right);
        } else {
            return binarySearchRecursiveHelper(arr, target, left, mid - 1);
        }
    }
    
    /**
     * Find the first occurrence of target in a sorted array with duplicates
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public int findFirstOccurrence(int[] arr, int target) {
        if (arr == null) {
            return -1;
        }
        
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Continue searching left
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
    
    /**
     * Find the last occurrence of target in a sorted array with duplicates
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public int findLastOccurrence(int[] arr, int target) {
        if (arr == null) {
            return -1;
        }
        
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // Continue searching right
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
}