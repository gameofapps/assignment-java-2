package xyz.jdtec.algorithms;

import java.util.*;

public class Algorithms {
    // Question 1: Find all pairs for a given sum
    public static void findPairs(int[] testArray, int targetSum) {
        // If array length < 2, we can't do anything
        if (testArray.length < 2) {
            return;
        }

        Set<List<Integer>> pairs = new HashSet<>();          // Store the found pairs in a Set to prevent duplicates
        ArrayList<Integer> workingList = new ArrayList<>();  // Working list, see below for usage

        // Loop through all the elements of input array
        for (int num : testArray) {
            // Instead of checking a + b = c, check c - a = b;
            // ...where: a = num
            //           b = checkNum
            //           c = targetSum
            int checkNum = targetSum - num;

            if (!workingList.contains(checkNum)) {
                // Add current number (a) to "working list" if it doesn't contain complement of current number (b)
                workingList.add(num);
            }
            else {
                // Complement of current number (b) was found! Therefore, we must've found a pair; add to pairs Set
                pairs.add(Arrays.asList(num, checkNum));    // Note: I went through the trouble of storing the pairs
                                                            //       as a List rather than as a pre-formatted String
                                                            //       because later on, if we need to use the data in
                                                            //       some other way, it's easy to do so.
            }
        }

        // Run through the Set of pairs and print to stdout according to requested format
        for (List<Integer> pair : pairs) {
            System.out.println(String.format("(%d, %d)", pair.get(0), pair.get(1)));
        }
    }

    // Question 2: Is Palindrome
    public static boolean isPalindrome(String testString) {
        // Make sure string is lowercase as "Radar" != "radar"!
        testString = testString.toLowerCase();

        // Use the StringBuilder built-in class to reverse the string
        StringBuilder str = new StringBuilder(testString);
        String reverse = str.reverse().toString();

        // By definition: string is palindrome if string reads the same way normally and in reverse!
        return testString.equals(reverse);
    }

    // Main method, for Question 1 example.
    public static void main(String[] args) {
        // --- Given Example for findPairs --- //
        int[] testArray = {2, 4, 5, 1, 3, 5, 4};
        int targetSum = 6;

        findPairs(testArray, targetSum);
    }
}
