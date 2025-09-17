# Algorithm Java - Coding Test Preparation

A comprehensive collection of fundamental algorithms and data structures implemented in Java, designed for coding test and interview preparation.

## Project Structure

```
src/
├── main/java/com/algorithm/
│   ├── CodingTest.java          # Main demo class
│   ├── ArrayProblems.java       # Array manipulation algorithms
│   ├── StringProblems.java      # String processing algorithms
│   └── SearchAlgorithms.java    # Search algorithms
└── test/java/com/algorithm/
    └── AlgorithmTest.java       # Test suite
```

## Features

### Array Problems
- **Find Maximum/Minimum**: Find the largest/smallest element in an array
- **Bubble Sort**: Simple O(n²) sorting algorithm
- **Two Sum**: Find two numbers that add up to a target
- **Array Reversal**: Reverse an array in place

### String Problems
- **String Reversal**: Reverse a string
- **Palindrome Check**: Determine if a string is a palindrome
- **Anagram Detection**: Check if two strings are anagrams
- **Character Counting**: Count vowels and find non-repeating characters

### Search Algorithms
- **Linear Search**: O(n) sequential search
- **Binary Search**: O(log n) search for sorted arrays (iterative and recursive)
- **First/Last Occurrence**: Find boundaries of target in sorted array with duplicates

## How to Run

### Compile the code:
```bash
javac -d . src/main/java/com/algorithm/*.java
```

### Run the demo:
```bash
java com.algorithm.CodingTest
```

### Run tests:
```bash
javac -cp . -d . src/main/java/com/algorithm/*.java src/test/java/com/algorithm/*.java
java com.algorithm.AlgorithmTest
```

## Example Output

```
=== Coding Test Algorithms Demo ===

1. Array Problems:
Original array: [3, 1, 4, 1, 5, 9, 2, 6]
Max element: 9
Sorted array: [1, 1, 2, 3, 4, 5, 6, 9]

2. String Problems:
Original string: hello
Reversed: olleh
Is palindrome 'racecar': true

3. Search Algorithms:
Array: [1, 3, 5, 7, 9, 11, 13, 15]
Linear search for 7: 3
Binary search for 7: 3

=== Demo Complete ===
```

## Time and Space Complexity

All algorithms include detailed comments about their time and space complexity to help with interview preparation.

## Testing

The project includes a comprehensive test suite that validates all implemented algorithms with a 100% success rate.