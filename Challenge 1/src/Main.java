/*	By Elson
 */

public class Main {
    static int[] testArray = {2, 4, 5, 1, 3, 5, 4};
    static int targetSum = 6;
    static String word = "radar";

    public static void main(String[] args) {
        //Question 1
        Q1.findPairs(testArray, targetSum, false);

        //Question 2
        if (Q2.isPalindrome(word)) {
            System.out.println("'" + word + "'" + " is palindrome!");
        } else {
            System.out.println("'" + word + "'" + " is not palindrome!");
        }
    }

}