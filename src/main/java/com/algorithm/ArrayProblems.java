package com.algorithm;

/**
 * Array-related problems commonly found in coding tests
 */
public class ArrayProblems {
    
    /**
     * Find the maximum element in an array
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    /**
     * Find the minimum element in an array
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    /**
     * Bubble sort implementation
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public int[] bubbleSort(int[] arr) {
        if (arr == null) {
            return null;
        }
        
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    
    /**
     * Two Sum problem: Find two numbers that add up to target
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // Not found
    }
    
    /**
     * Reverse an array in place
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public void reverseArray(int[] arr) {
        if (arr == null) {
            return;
        }
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}