import java.util.*;

class challenge2 {

  public static void main(String[] args) {
    // Test string 1
    String testString = "bob";
    isPalindrome(testString);

    // Test string 2
    testString = "canada";
    isPalindrome(testString);

  }
  // The method that will check if a word is a palindrome
  static boolean isPalindrome(String testString) {

    int strLength = testString.length();

    // we only need to check half of the word.
    for (int i = 0; i < strLength/2; i++) {
      // compare the first letter of the word with the last and so on.
      if (testString.charAt(i) != testString.charAt(strLength-i-1)){
        System.out.println(testString + " is not a palindrome."); 

          return false;
      }
    }

        System.out.println(testString + " is a palindrome.");

          return true;


 }


}