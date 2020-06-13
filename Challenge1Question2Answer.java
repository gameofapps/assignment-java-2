class Main {
  public static void main(String[] args) {
    
    //CHANGE THIS. This is the word to check if it's a palindrome.
    String testString = "Radar";
    
    isPalindrome(testString);

  }

  static boolean isPalindrome(String testString) {
    
    //Creating a byte array that temporarily stores the word in lowercase
    byte [] stringAsByteArray = testString.toLowerCase().getBytes(); 
  
    //Creating a byte array that will store the word in reverse order
    byte [] reverseString =  new byte [stringAsByteArray.length]; 
  
    //Actually storing the word in reverse order
    for (int i = 0; i<stringAsByteArray.length; i++) 
        reverseString[i] = stringAsByteArray[stringAsByteArray.length-i-1];
      
    //Check the forward and reverse words against each other then print answer
    boolean answer = testString.toLowerCase().equals(new String(reverseString));
    if (answer == true){
      System.out.println ("\"" + testString + "\"" + " is a palindrome.");
    } else {
      System.out.println ("\"" + testString + "\"" + " is not a palindrome."); 
    }

  return answer;
  }
}