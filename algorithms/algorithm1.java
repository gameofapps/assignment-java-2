import java.util.ArrayList;

class algorithm1 {
  
  public static void main(String[] args) {
    int[] testArray = {2, 4, 6, 1, 3, 5, 4};
    int targetSum = 7;

    // Call on method findPairs
    findPairs(testArray, targetSum);
    
  }
    
  static void findPairs(int[] testArray, int targetSum) {
    // Store Pairs in ArrayList
    ArrayList<String> pair = new ArrayList<String>() ; 

    // Repeat for each number in testArray
    for (int baseNumber: testArray) {
      // Take another number from testArray
      for (int secondNumber: testArray){
        // Prevents duplicates
        if (secondNumber < baseNumber) {
          // do nothing
        }
        else{
        // if sum of baseNumber and secondNumber is equal to 7, then add the pair
          if (baseNumber + secondNumber == targetSum){
          String s1 = "(" + baseNumber + "," + secondNumber + ")";
          // Only add pair if it's not a duplicate
          if (!pair.contains(s1)){
            pair.add(s1);
          }
             
        }
        }
        
      }
      
    }
    // Print the pairs
    System.out.println(pair);
    }
    
    
    
}