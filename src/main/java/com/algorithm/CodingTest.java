package com.algorithm;

/**
 * Main class for Coding Test algorithms and data structures
 * This class contains common problems and solutions used in coding interviews
 */
public class CodingTest {
    
    public static void main(String[] args) {
        System.out.println("=== Coding Test Algorithms Demo ===");
        
        // Array Operations Demo
        ArrayProblems arrayProblems = new ArrayProblems();
        int[] testArray = {3, 1, 4, 1, 5, 9, 2, 6};
        System.out.println("\n1. Array Problems:");
        System.out.println("Original array: " + java.util.Arrays.toString(testArray));
        System.out.println("Max element: " + arrayProblems.findMax(testArray));
        System.out.println("Sorted array: " + java.util.Arrays.toString(arrayProblems.bubbleSort(testArray.clone())));
        
        // String Operations Demo
        StringProblems stringProblems = new StringProblems();
        String testString = "hello";
        System.out.println("\n2. String Problems:");
        System.out.println("Original string: " + testString);
        System.out.println("Reversed: " + stringProblems.reverseString(testString));
        System.out.println("Is palindrome 'racecar': " + stringProblems.isPalindrome("racecar"));
        
        // Search Algorithms Demo
        SearchAlgorithms search = new SearchAlgorithms();
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 7;
        System.out.println("\n3. Search Algorithms:");
        System.out.println("Array: " + java.util.Arrays.toString(sortedArray));
        System.out.println("Linear search for " + target + ": " + search.linearSearch(sortedArray, target));
        System.out.println("Binary search for " + target + ": " + search.binarySearch(sortedArray, target));
        
        System.out.println("\n=== Demo Complete ===");
    }
}