import java.util.Arrays;

public class Q1 {

    public static void findPairs(int[] testArray, int targetSum) {
    	
        //sort the array
        Arrays.sort(testArray);

        //initialize an index to keep track of placement
        int i = 0;
        int j;

        //find the length of the array
        int length = testArray.length;

        //we only have to check numbers up to half of the target sum
        while (testArray[i] <= targetSum / 2) {
            //make sure we do not calculate duplicates by not testing cases where testArray[i] is identical to the one previous

            if (i > 0 ? testArray[i] != testArray[i - 1] : testArray[i] <= targetSum / 2) {

                for (j = i + 1; j < length; j++) {

                    if (testArray[j] == targetSum - testArray[i]) {
                        System.out.println("(" + testArray[i] + "," + testArray[j] + ")");
                        i++;
                        break;
                    }

                    if (j==length-1){	//when you reach the end of the array without finding a pair, accumulate i
                    	i++;
                    }
                }
            }

            else{
            	i++;
            }
        }
    }


    public static void main(String[] args) {
        int[] testArray = {2, 4, 3, 3, 3, 5, 5, 5, 5, 2, 6, 8, };
        int targetSum = 10;

        findPairs(testArray, targetSum);
    }

}