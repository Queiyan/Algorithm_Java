package com.algorithm;

/**
 * Simple test class for the coding test algorithms
 * This is a basic testing approach without external dependencies
 */
public class AlgorithmTest {
    
    private int totalTests = 0;
    private int passedTests = 0;
    
    public static void main(String[] args) {
        AlgorithmTest test = new AlgorithmTest();
        test.runAllTests();
    }
    
    public void runAllTests() {
        System.out.println("=== Running Algorithm Tests ===\n");
        
        testArrayProblems();
        testStringProblems();
        testSearchAlgorithms();
        
        System.out.println("\n=== Test Results ===");
        System.out.println("Total tests: " + totalTests);
        System.out.println("Passed: " + passedTests);
        System.out.println("Failed: " + (totalTests - passedTests));
        System.out.println("Success rate: " + (passedTests * 100.0 / totalTests) + "%");
    }
    
    private void testArrayProblems() {
        System.out.println("Testing Array Problems:");
        ArrayProblems arrayProblems = new ArrayProblems();
        
        // Test findMax
        int[] arr1 = {3, 1, 4, 1, 5, 9, 2, 6};
        assertEqual(arrayProblems.findMax(arr1), 9, "findMax test");
        
        // Test findMin
        assertEqual(arrayProblems.findMin(arr1), 1, "findMin test");
        
        // Test twoSum
        int[] twoSumResult = arrayProblems.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertTrue(twoSumResult[0] == 0 && twoSumResult[1] == 1, "twoSum test");
        
        // Test bubbleSort
        int[] sortTest = {3, 1, 4, 1, 5};
        int[] sorted = arrayProblems.bubbleSort(sortTest);
        assertTrue(isSorted(sorted), "bubbleSort test");
        
        System.out.println();
    }
    
    private void testStringProblems() {
        System.out.println("Testing String Problems:");
        StringProblems stringProblems = new StringProblems();
        
        // Test reverseString
        assertEqual(stringProblems.reverseString("hello"), "olleh", "reverseString test");
        
        // Test isPalindrome
        assertTrue(stringProblems.isPalindrome("racecar"), "isPalindrome test 1");
        assertFalse(stringProblems.isPalindrome("hello"), "isPalindrome test 2");
        
        // Test areAnagrams
        assertTrue(stringProblems.areAnagrams("listen", "silent"), "areAnagrams test");
        
        // Test countVowels
        assertEqual(stringProblems.countVowels("hello"), 2, "countVowels test");
        
        System.out.println();
    }
    
    private void testSearchAlgorithms() {
        System.out.println("Testing Search Algorithms:");
        SearchAlgorithms search = new SearchAlgorithms();
        
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        
        // Test linearSearch
        assertEqual(search.linearSearch(sortedArray, 7), 3, "linearSearch test");
        assertEqual(search.linearSearch(sortedArray, 100), -1, "linearSearch not found test");
        
        // Test binarySearch
        assertEqual(search.binarySearch(sortedArray, 7), 3, "binarySearch test");
        assertEqual(search.binarySearch(sortedArray, 100), -1, "binarySearch not found test");
        
        // Test recursive binary search
        assertEqual(search.binarySearchRecursive(sortedArray, 7), 3, "binarySearchRecursive test");
        
        System.out.println();
    }
    
    private void assertEqual(int actual, int expected, String testName) {
        totalTests++;
        if (actual == expected) {
            passedTests++;
            System.out.println("✓ " + testName + " PASSED");
        } else {
            System.out.println("✗ " + testName + " FAILED: expected " + expected + ", got " + actual);
        }
    }
    
    private void assertEqual(String actual, String expected, String testName) {
        totalTests++;
        if (actual != null && actual.equals(expected)) {
            passedTests++;
            System.out.println("✓ " + testName + " PASSED");
        } else {
            System.out.println("✗ " + testName + " FAILED: expected '" + expected + "', got '" + actual + "'");
        }
    }
    
    private void assertTrue(boolean condition, String testName) {
        totalTests++;
        if (condition) {
            passedTests++;
            System.out.println("✓ " + testName + " PASSED");
        } else {
            System.out.println("✗ " + testName + " FAILED: expected true, got false");
        }
    }
    
    private void assertFalse(boolean condition, String testName) {
        totalTests++;
        if (!condition) {
            passedTests++;
            System.out.println("✓ " + testName + " PASSED");
        } else {
            System.out.println("✗ " + testName + " FAILED: expected false, got true");
        }
    }
    
    private boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}