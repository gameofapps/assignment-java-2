//code determines if a word is a palindrome and returns true or false
public class palindrome {
  public static void main(String[] args){
    String testString = "radar";
    System.out.println(isPalindrome(testString));
  }

  public static boolean isPalindrome(String testString){
    int countDown = testString.length() - 1;

    //the for loop compares the beginning of the string with the end to see if its a palindrome
    for(int i = 0; i < testString.length(); i++){

      if(testString.charAt(i) != testString.charAt(countDown)){
        return false;
      }
    countDown--;
    }
    return true;
  }   
}