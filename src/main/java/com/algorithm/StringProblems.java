package com.algorithm;

/**
 * String-related problems commonly found in coding tests
 */
public class StringProblems {
    
    /**
     * Reverse a string
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    
    /**
     * Check if a string is a palindrome
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    /**
     * Check if two strings are anagrams
     * Time Complexity: O(n log n)
     * Space Complexity: O(n)
     */
    public boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        
        if (str1.length() != str2.length()) {
            return false;
        }
        
        char[] chars1 = str1.toLowerCase().toCharArray();
        char[] chars2 = str2.toLowerCase().toCharArray();
        
        java.util.Arrays.sort(chars1);
        java.util.Arrays.sort(chars2);
        
        return java.util.Arrays.equals(chars1, chars2);
    }
    
    /**
     * Find the first non-repeating character in a string
     * Time Complexity: O(n)
     * Space Complexity: O(1) - limited to 26 letters
     */
    public char firstNonRepeatingChar(String str) {
        if (str == null || str.isEmpty()) {
            return '\0';
        }
        
        int[] charCount = new int[26];
        str = str.toLowerCase();
        
        // Count character frequencies
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                charCount[c - 'a']++;
            }
        }
        
        // Find first character with count 1
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z' && charCount[c - 'a'] == 1) {
                return c;
            }
        }
        
        return '\0'; // No non-repeating character found
    }
    
    /**
     * Count vowels in a string
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int countVowels(String str) {
        if (str == null) {
            return 0;
        }
        
        int count = 0;
        String vowels = "aeiouAEIOU";
        
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        
        return count;
    }
}