import java.util.Arrays;

public class AllPairsForGivenSum {

    public static void findPairs(int[] testArray, int targetSum) {
        if (testArray == null) {
            return;
        }
        int[] sortedTestArray = testArray;
        Arrays.sort(sortedTestArray);
        int start = 0;
        int end = testArray.length - 1;

        while(start < end) {
            int firstElement = sortedTestArray[start];
            int secondElement = sortedTestArray[end];
            if (firstElement + secondElement == targetSum) {
                System.out.printf("(%d, %d)\n", firstElement, secondElement);
            } else if (firstElement + secondElement > targetSum) {
                end--;
                continue;
            }
            start++;
        }
    }
}
