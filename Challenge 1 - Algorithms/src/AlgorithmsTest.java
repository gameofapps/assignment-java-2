import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlgorithmsTest {

	@Test
	void FindPairsTest() {		
		//example
		int[] testArray = {2, 4, 5, 1, 3, 5, 4};
		int targetSum = 6;
		
		String[] outputs = new String[] {"(2, 4)", "(1, 5)"};
		
		assertArrayEquals(outputs, Algorithms.FindPairs(testArray,targetSum));
		
		//same number pair
		testArray = new int[]{2, 4, 5, 1, 3, 3, 5, 4};
		targetSum = 6;		
		outputs = new String[] {"(2, 4)", "(1, 5)", "(3, 3)"};
		
		assertArrayEquals(outputs, Algorithms.FindPairs(testArray,targetSum));
		
		//unique pair
		testArray = new int[]{1, 5, 1, 5};
		targetSum = 6;		
		outputs = new String[] {"(1, 5)",};
		
		assertArrayEquals(outputs, Algorithms.FindPairs(testArray,targetSum));
		
		//negative
		testArray = new int[]{1, 0, 0, -1};
		targetSum = 0;		
		outputs = new String[] {"(-1, 1)", "(0, 0)"};
		
		assertArrayEquals(outputs, Algorithms.FindPairs(testArray,targetSum));
		
		//negative
		testArray = new int[]{1, 0, 0, -1};
		targetSum = -1;		
		outputs = new String[] {"(-1, 0)",};
		
		assertArrayEquals(outputs, Algorithms.FindPairs(testArray,targetSum));
	}
	
	@Test
	void IsPalindromeTest() {
		//examples
		assertEquals(true, Algorithms.isPalindrome("radar"));
		assertEquals(true, Algorithms.isPalindrome("bob"));
		assertEquals(false, Algorithms.isPalindrome("boba"));
		
		//case insensitive
		assertEquals(true, Algorithms.isPalindrome("boB"));
		
		//non alpha, bad input
		assertEquals(false, Algorithms.isPalindrome("$boB$"));
	}

}
