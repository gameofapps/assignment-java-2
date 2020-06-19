public class Palindrome{
  public static boolean isPalindrome(String testString){
    //starts at both ends of the word. Compares each letter and gets close to the middle letters.
    //loop ends in the middle of the word.
    //If its odd number of characters or word is one letter, middle letter is avoided.
    for (int i = 0; i < testString.length()/2; i ++){
      //If the two chars are not the same letter, return false
      if (testString.charAt(i) != testString.charAt(testString.length()-i-1)){
        return false;
      }
    }
    //All letters of the word have been compared and resemble a palindrome
    return true;
  }
  public static void main(String[] args) {
    //Words that return true (Taken from question)
    System.out.println(isPalindrome("radar"));
    System.out.println(isPalindrome("bob"));
    System.out.println(isPalindrome("asdfdsa"));

    //Words that return false (I made these up)
    System.out.println(isPalindrome("apple"));
    System.out.println(isPalindrome("love"));
    System.out.println(isPalindrome("asdsdfdsafdsgfherfdsa"));
  }
}