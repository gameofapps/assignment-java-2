import java.util.ArrayList;
import java.util.Arrays;

public class FindAllPairs {
  public static void findPairs(int[] testArray, int targetSum){
    ArrayList<Integer> newArray = new ArrayList<Integer>();
    //Array to store new sorted list without duplicates

    Arrays.sort(testArray);
    //Sorts test Array
    //(1,2,4,4,5,5)

    newArray.add(testArray[0]);
    //Adds first element of testArray to the Arraylist

    boolean targetSumHalf = false;
    //boolean if exists a pair of numbers that are the same value, but added up equal targetSum

    for (int i = 0; i < testArray.length-1; i ++){
      //If there are a pair of duplicates (Pairs where both the numbers are the same, but their sums equal targetSum),
      //they are counted as a pair.
      if (newArray.get(newArray.size()-1)!=testArray[i+1]){
        //Since list is expanding, checks previously added element with the testArray
        newArray.add(testArray[i+1]);
        //Adds testArray element if its unique to the recently added Arraylist element
      }
      else{
        if (testArray[i+1]*2 == targetSum && targetSumHalf == false ){
          System.out.println ("("+ newArray.get(newArray.size()-1)+","+ testArray[i+1]+")");
          targetSumHalf = true;
        }
      }
    }
    //Now uses newArray, which has list with non-duplicate numbers
    //(1,2,4,5)

    //Starting at ends of the newArray
    int start = 0;
    int end = newArray.size()-1;

    //Keeps on looping until the two ends have met.
    while (start < end){
      int sum = newArray.get(start) + newArray.get(end);

      //checking if sum of the start and end index elements are equal to target sum
      if (sum == targetSum){
        //prints the pair, increments start and decrements end and continues
        System.out.println ("("+ newArray.get(start)+","+ newArray.get(end)+")");
        start++;
        end--;
      }
      else if (sum < targetSum){
        //if sum is less than targetSum, range moves up to use bigger numbers for comparison.
        start++;
      }
      else{
        // If sum is more than targetSum, range moves down to use smaller numbers.
        end--;
      }
    }
  }
  public static void main(String[] args){
    //Example values
    int[] testArray = {2, 4, 5, 1, 3, 5, 4};
    int targetSum = 6;

    //Values to be printed on the console are
    //(2,4)
    //(1,5)
    findPairs(testArray, targetSum);
  }
}