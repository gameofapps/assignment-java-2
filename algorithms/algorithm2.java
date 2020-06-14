import java.util.*;

class algorithm2 {

  public static void main(String[] args) {
  
  // test 1 (palindrome)
  String testString = "Racecar";
  isPalindrome(testString);
  
  // test 2 (not palindrome)
  testString = "Richmond";
  isPalindrome(testString);
  }
      
  // method to check for palindrome
  static boolean isPalindrome(String testString){
    
    int length = testString.length();
    
    // only needs to repeat for half of the word
    for(int x = 0; x < length/2; x++){
      // lowercase the word, and compare first letter with last letter, second letter with second last letter, etc.
      if (testString.toLowerCase().charAt(x) != testString.toLowerCase().charAt(length-x-1)){
        System.out.print("No, " + "'" + testString + "'" + " is not a palindrome :(\n");

        return false;
      }
    }
    System.out.print("Yes, " + "'" + testString + "'" + " is a palindrome!\n");

    return true;
  }
}