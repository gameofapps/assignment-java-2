
import java.util.Arrays;
import java.util.*;

public class Algorithms {
	
	public static void findPairs(int[] testArray, int targetSum) {
		
		//Arrays.sort(testArray);
		
		Map<Integer, Integer> testArrayMap = new HashMap<Integer, Integer>();
		Set<Integer> outputSet = new HashSet<Integer>();
		
		for(int i=0;i<testArray.length;i++) {
			
			int num = testArray[i];
			
			int count = testArrayMap.containsKey(num) ? testArrayMap.get(num) : 0;
			testArrayMap.put(num, count + 1);	
		}
		
		for(int i=0;i<testArray.length;i++) {
			
			Integer num = new Integer(testArray[i]);
			Integer difference = new Integer(targetSum - num);
			
			//System.out.println(difference);
					
			if(testArrayMap.containsKey(difference)) {
				
				if(difference.equals(num)) {					
					if(testArrayMap.get(num) < 2) {						
						continue; //if same numbers and no duplicates then continue
					}
				}
				
				Integer min = Math.min(num, difference);
				Integer max = Math.max(num, difference);
				
				if(!outputSet.contains(min)) { //test if already outputed pair
					System.out.println("(" + min + ", " + max + ")");		
					
					outputSet.add(min);
				}				
			}
		}
		
	}
	
	public static boolean isPalindrome(String testString) {
		int length = testString.length();
		
		if(length <= 1) {
			return true; //base case
		}
		
		int mid = Math.floorDiv(length, 2);
		
		for(int i=0;i<mid;i++) {
			char front = testString.charAt(i);
			char back = testString.charAt(length-i-1);
			
			if(front != back) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {		
		int[] testArray = {2, 4, 5, 1, 3, 5, 4};
		int targetSum = 6;
		// Expected pairs are (to be printed on the console):
		// (2, 4)
		// (1, 5)

		findPairs(testArray, targetSum);
		
		System.out.println(isPalindrome("radar"));
		System.out.println(isPalindrome("bob"));
		System.out.println(isPalindrome("cboba"));
		
	}
}
