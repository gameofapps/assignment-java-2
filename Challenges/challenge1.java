import java.util.ArrayList;
import java.util.Arrays;

class challenge1 {

    public static void main(String[] args) {
        // Example values
        int[] testArray = {2, 4, 5, 1, 3, 5, 4};
        int targetSum = 6;
      
        // Expected pairs are (to be printed on the console):
        // (2, 4)
        // (1, 5)
        
        findPairs(testArray, targetSum);
    }

    public static void findPairs(int[] testArray, int targetSum) {
      // Sort the test array 
      Arrays.sort(testArray);
      // {1,2,3,4,4,5,5}
      // Initalize start and end variables for the array
      int s = 0;
      int e = testArray.length - 1;
      // While your end value is greater than your start value the loop will continue to look for pairs
      while (s < e) {
        int fSum = (testArray[s] + testArray[e]);
        // If the sum is smaller than the target sum leftside will increment 1
        if (fSum < targetSum) {
          s++;
        // If the sum is smaller than the target sum rightside will increment 1
        } else if (fSum > targetSum) {
          e--;
        // If the sum equals to the target sum the pair will print and both the numbers will increment 1.  
        } else if (fSum == targetSum){
            System.out.printf("(%d, %d)\n", testArray[s], testArray[e]);
            e--;
            s++;
        } 

      }



  }    

}
