package q2;

/**
 *
 * @author Gerry
 */
public class Q2 {

    public static boolean isPalindrome(String testString) {
      // Find length of the string and declare a counter variable
        int stringLength = testString.length(); 
        int count = 0;
        
        // For loop checks through the first and last element of the string, then it moves up one digit and the last digit moves down one 
        // When the length of the string is odd, integer division floors the value. 
        // We do this as we do not need to check the middle element for an odd length string
        for (int i = 0; i < (stringLength / 2); ++i) {
                if (testString.charAt(0 + i) == testString.charAt(stringLength - i - 1)) {
                    ++count;
                }
                else {
                    System.out.println("False");
                    return false;
                }
            }
        // Count keeps track of the number of matching characters, if it equals stringLength/2, then it is a palindrome.
            if (count == (stringLength / 2) ){
                System.out.println("True");
                return true;
            }
        return false;
    }
    
    
    public static void main(String[] args) {
        String test = "radar";
        
        isPalindrome(test);
        
    }
    
}
