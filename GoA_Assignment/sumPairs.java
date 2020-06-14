import java.util.*;

//Prints pairs of numbers in testArray that equals the targetSum
public class sumPairs{
  public static void main(String[] args){
    int[] testArray = {2,4,5,1,3,5,4};
    int targetSum = 6;
    findPairs(testArray, targetSum);      
  }

  public static void findPairs(int[] testArray, int targetSum){
    int num1;
    int num2;
    //Sorting the array eleminates finding identical pairs such as (5,1) and (1,5)
    Arrays.sort(testArray);

    HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();

    //The two for loops goes through every combination in the array to find the targetSum
    for(int i = 0; i < testArray.length; i++){

      num1 = testArray[i];
      for(int k = i + 1; k < testArray.length; k++){
        num2 = testArray[k];

        //Checks if one of the numbers is already in the hashmap
        if(pairs.containsKey(num1)){
          
          //Checks if the pair is equal to the sum and if the pair is already in the hashmap
          if(num1 + num2 == targetSum && pairs.get(num1) != num2){
            //Puts the pair in a hashmap to keep track of all the combinations
            pairs.put(num1, num2);
            System.out.println("(" + num1 + ", " + num2 + ")");
          }
        }
        else{

          if(num1 + num2 == targetSum){
            pairs.put(num1, num2);
            System.out.println("(" + num1 + ", " + num2 + ")");

          }
        }
      }
    }
  }   
}