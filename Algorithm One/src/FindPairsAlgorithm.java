import java.util.*;

public class FindPairsAlgorithm {

    public static void main(String[] args) {

        // Tested for use cases 0, negative, empty array
        int[] testArray = {3, 7, 1, 8, 0, 2, 6, 5};
        int targetSum = 8;
        // Expected pairs are (to be printed on the console):
        // (2, 4)
        // (1, 5)

        findPairs(testArray, targetSum);

    }

    // Method I used avoids nested for loops because of time complexity
    static void findPairs(int[] array, int target) {

        List<Integer> arrayList = new ArrayList<>();

        // Extended for loop to "convert" array into ArrayList
        for (int i : array) {
            arrayList.add(i);
        }

        // Iterates through all indexes of array
        for (int i = 0; i < array.length; i++) {
            // Avoid NullPointerException
            // And optimizes program such that if it detects a value is null, it moves onto next iteration
            if (arrayList.get(i) != null) {
                // Subtracts value of element at current index from target
                // Result is the number needed such that when summed with the current element, the target is hit
                int num = target - arrayList.get(i);
                // Once value is used, set to null to avoid reuse
                arrayList.set(i, null);
                System.out.println(arrayList);
                // Checks if the needed number is still in the ArrayList
                if (arrayList.contains(num)) {
                    // If number needed number exists, then print both needed number and current index and set both to null
                    System.out.println("(" + array[i] + ", " + num + ")");
                    arrayList.set(arrayList.indexOf(num), null);

                }
            }
        }
    }
}