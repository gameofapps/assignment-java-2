import java.util.Arrays;

class Main {
	public static void main (String[] args){
		
    //CHANGE THIS. The values to check and the sum wanted.
    int[] testArray = {2, 4, 5, 1, 3, 5, 4};
		int targetSum = 6;

		findPairs(testArray, targetSum);
	}

  //Checks every pair in testArray to see if it adds up to targetSum.
	public static void findPairs(int[] testArray, int targetSum)
	{
    //Integer for checking if pairs are found at all.
    int pairsNotFound = 0;
    
    //Takes all but the last element for comparison.
		for (int i = 0; i < testArray.length - 1; i++)
		{
      //Takes all but the first element for comparison.
			for (int j = i + 1; j < testArray.length; j++)
			{
				//If there is the right sum, prints out the pair.
        if (testArray[i] + testArray[j] == targetSum) {
          System.out.println("(" + testArray[i] + ", " +  testArray[j] + ")");
          }  else {
            pairsNotFound++;
          }
      }
    }
    //Tells you that there are no pairs.
    if (pairsNotFound == (testArray.length*(testArray.length-1))/2){
      System.out.println ("No pairs found.");
    }
  }
}
