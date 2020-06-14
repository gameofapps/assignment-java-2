public class PalindromeAlgorithm {

    public static void main(String[] args){
        //Sample string to input into the method to check for palindrome status
        String stringSample = "racecar";
        //Print out the return statement of the method
        System.out.println(isPalindrome(stringSample));
    }

    //Method for finding if string is a palidrome or not
    static boolean isPalindrome(String str){
        //Iterates through the characters of the string, checking if the string is a palindrome or not
        //Rounds down of string is odd. Does not need to check the character in the middle as it is irrelevant to a palindrome
        for(int chars = 0; chars < str.length() / 2; chars++){
            //Checks the first and last characters if they are identical, immediately returns false once unidentical
            if(str.charAt(chars) != str.charAt(str.length() - chars - 1)){
                return false;
            }
        }
        //Returns true if does not detect any unidentical characters which would disqualify the string from being a palindrome
        return true;
    }
}
