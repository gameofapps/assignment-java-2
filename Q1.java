package Q1;

/**
 *
 * @author Gerry Zhang
 * May 13th, 2019
 */
import java.util.Arrays;

public class Q1 {
    private static void findPairs(int[] testArray, int targetSum) {

        // storeArray will store previous printed values so that it can be used to remove duplicates.
        int storeArray[];
        storeArray = new int[testArray.length];
        
        // Take the ith element and search through the entire array for values that sum to target
        for (int i = 0; i < testArray.length; ++i) {
            for (int j = i; j < testArray.length; ++j) {
                
                // Check if the elements of the array sum to the target. I am going to assume that we do not include elements of the same index.
                if (testArray[i] + testArray[j] == targetSum && i != j) {
                    
                    // Check the store array to see if the values have been printed already.
                    if (storeArray[0] != testArray[i] && storeArray[1] != testArray[j])
                        // Check the complement so that we don't print duplicates.
                        if (storeArray[0] != testArray[j] && storeArray[1] != testArray[j])
                            
                            // Print the values that equal the target sum and store them in the array.
                            System.out.println("(" + testArray[i] + ", " + testArray[j] + ")");
                                storeArray[0] = testArray[i];
                                    storeArray[1] = testArray[j];
                        }
                    }
                }
            }
    
     public static void main(String[] args){
        int[] testArray = {2, 4, 5, 1, 3, 5, 4};
        int targetSum = 6;
        
        findPairs(testArray, targetSum);
    }
}
