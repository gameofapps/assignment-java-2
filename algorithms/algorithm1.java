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
    ArrayList<String> pairList = new ArrayList<String>(); 

    // Repeat for each number in testArray
    for (int firstNumber: testArray) {
      // Take another number from testArray
      for (int secondNumber: testArray) {
        // Only need to run through half the numbers
        if (secondNumber < firstNumber) {
          // do nothing
        } else {
            String pair = "(" + firstNumber + "," + secondNumber + ")";
            // if sum of firstNumber and secondNumber is equal to targetSum, then it's a pair
            // only add if the pair isn't inside pairList already
            if (firstNumber + secondNumber == targetSum && !pairList.contains(pair)) {
              pairList.add(pair);
            }
          } 
      }
      // if there are no pairs, return with this result
      boolean pairEmpty = pairList.isEmpty();
      
      if (pairEmpty == true) {
        pairList.add("No pairs :(");
      }
    }
    // Print results
    System.out.println(pairList);
  }
}