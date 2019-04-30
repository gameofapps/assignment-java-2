package com.example.challenge1;

import java.util.HashMap;
import java.util.Map;

public class Question1 {

    private static void findPairs(int[] testArray, int targetSum) {
        // ASSUMPTIONS:
        // 1. values in testArray range from 1 - (targetSum - 1)


        // The first attempt I made involved nested loops.
        // I suspected it would be faster to use a dictionary of some kind so I researched
        // the question and found out
        // 1. it is
        // 2. the Java name for a dict is a map

        HashMap<Integer, Integer> pairMap = new HashMap<>();

        // variable used to handle values that are half of targetSum
        int duplicate = 0;

        for (int i : testArray) {
            // count number of values that are exactly half of targetSum
            if (i == targetSum - i) { duplicate++; }

            // every possible pair is added to map
            pairMap.put(i, targetSum - i);
        }

        for (int i = 0; i < targetSum; i++) {
            // removes duplicates from map as well as pairs that don't exist
            // ex: { 5 } will not print out (5, 1) since 1 is not in array

            // half of targetSum is dealt with later
            if (pairMap.containsValue(i) && pairMap.containsKey(i) && i != targetSum - i) {
                pairMap.remove(i);
            }
        }

        // remove half of targetSum from map if there isn't more than one in array
        if (duplicate < 2) {
            pairMap.remove(targetSum / 2);
        }

        for (Map.Entry<Integer, Integer> i : pairMap.entrySet()) {
            System.out.println("(" + i.getKey() + ", " + i.getValue() + ")");

        }

    }

    public static void main(String[] args) {
        int[] testArray = {2, 4, 5, 1, 3, 5, 4};
        int targetSum = 6;

        findPairs(testArray, targetSum);
    }
}
