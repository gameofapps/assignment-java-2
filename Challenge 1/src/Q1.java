import java.util.ArrayList;

import javax.swing.Spring;

public class Q1 {
	static int[] testArray = {2, 4, 5, 1, 3, 5, 4};
	static int targetSum = 6;
	// Expected pairs are (to be printed on the console):
	// (2, 4)
	// (1, 5)

	//findPairs(testArray, targetSum);
	
	
	
	public static void findPairs () {
		
		ArrayList<int[]> cars = new ArrayList<int[]>();
		
		
		for(int i = 0; i < testArray.length; i++) {
			int firstValue = testArray[i];
			
			for(int k = 0; k < testArray.length; k++) {
				int secondValue = testArray[k];
				int sumValues = firstValue + secondValue;
				//System.out.println(firstValue + "+" + secondValue + "=" + sumValues);
				if (sumValues == targetSum && k != i) {
					//System.out.println(firstValue + "," + secondValue);
					
				}
			}
			
		}
	
	}
	
	
	private static String duplicateRemover (int[] as) {
		return null;
		
	}
	
	
	
	
	
	
	
	
}
