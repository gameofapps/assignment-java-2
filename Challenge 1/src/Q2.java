public class Q2 {
	
	public static boolean isPalindrome(String word) {
		//create array of letters from input string
		char[]letters = word.toCharArray();
		
		//check if word is palindrome
		for (int i = 0; i < letters.length / 2; i++)					//loop iterates towards center of word
			if (letters[i] != letters[letters.length -1 -i])			//compare inital and ending elements of array
				return false;			
		return true;
	}
	
}

/*	initial idea was to create two arraylists using for-loops; 
 *	one composed of initial string characters and another of it reversed using collections.reverse(<List>);
 *	then I would compare the two arraylists to each other to check if they matched
 *	realized that I could just use <array>.toCharArray(); instead of for-loops, but only for arrays
 *	no convenient way to reverse arrays, so I just checked the inital and ending characters manually
 */