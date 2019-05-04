public class Q2{

	public static boolean isPalindrome(String testString) {


		//find the length of the string
		int length = testString.length();

		//compare each letter to the same letter in the reverse position
		for (int i = 0; i < length/2; i++){
			//subtract one more from the length as length is always one more than the last index
			if (testString.charAt(i) != testString.charAt(length-i-1)){
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		boolean string1 = isPalindrome("remembertobuyeggs");
		boolean string2 = isPalindrome("radar");
		boolean string3 = isPalindrome("asdffdsa");
		boolean string4 = isPalindrome("thisisnotapalindrome");


		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string3);
		System.out.println(string4);
	}
}