public class Main {
    public static void main(String[] args) {
        // tests for Challenge 1
        int[] testArray1 = {2, 4, 5, 1, 3, 5, 4};
        int targetSum1 = 6;
        AllPairsForGivenSum.findPairs(testArray1, targetSum1);

        int[] testArray2 = {1, 10, 25, 35, 60, 50};
        int targetSum2 = 60;
        AllPairsForGivenSum.findPairs(testArray2, targetSum2);

        int[] testArray3 = {0, 0};
        int targetSum3 = 6;
        AllPairsForGivenSum.findPairs(testArray3, targetSum3);

        int[] testArray4 = null;
        int targetSum4 = 6;
        AllPairsForGivenSum.findPairs(testArray4, targetSum4);

        int[] testArray5 = {};
        int targetSum5 = 6;
        AllPairsForGivenSum.findPairs(testArray5, targetSum5);

        // tests for Challenge 2
        String testString1 = "radar";
        String testString2 = "bob";
        String testString3 = "asdfdsa";
        String testString4 = "              Mr. Owl Ate My Metal Worm";
        String testString5 = "A Santa Lived As a Devil At NASA      ";
        String testString6 = "I am not a palindrome      ";
        String testString7 = "SQUIRRELLED";

        System.out.println(Palindrome.isPalindrome(testString1));
        System.out.println(Palindrome.isPalindrome(testString2));
        System.out.println(Palindrome.isPalindrome(testString3));
        System.out.println(Palindrome.isPalindrome(testString4));
        System.out.println(Palindrome.isPalindrome(testString5));
        System.out.println(Palindrome.isPalindrome(testString6));
        System.out.println(Palindrome.isPalindrome(testString7));
    }
}
