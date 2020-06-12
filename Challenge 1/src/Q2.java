public class Q2 {

    public static boolean isPalindrome(String word) {
        //create array of letters from input string
        char[] letters = word.toCharArray();

        //check if word is palindrome
        for (int i = 0; i < letters.length / 2; i++) //loop iterates towards center of word
            if (letters[i] != letters[letters.length - 1 - i]) //compare inital and ending elements of array
                return false;
        return true;
    }

}