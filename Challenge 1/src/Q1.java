import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.Spring;

public class Q1 {
	
	public static void findPairs (int[] testArray, int targetSum, boolean unique) {
		//are duplicate numbers unique? Etc. if 4 appears twice, it will be treated as 4a and 4b. If not, the duplicate numbers are removed	
		if (!unique) 
			testArray = removeDuplicates(testArray);
	    
		//calculation and printing
		for(int i = 0; i < testArray.length; i++) {							//obtaining first value in pair
			int firstValue = testArray[i];	
			for(int k = i + 1; k < testArray.length; k++) {					//obtaining second value in pair, beginning after first value to avoid repetitions
				int secondValue = testArray[k];				
				if (firstValue + secondValue == targetSum)					//checking if pair summation equals sum
					System.out.println(firstValue + "," + secondValue);		//printing
			}
		}	
	}
	
	private static int[] removeDuplicates(int[] array) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i : array)
		    set.add(i);
		int[] newArray = set.stream().mapToInt(i->i).toArray();				//set -> Stream<Integer> -> IntStream -> int[] 
		return newArray;
	}

}
