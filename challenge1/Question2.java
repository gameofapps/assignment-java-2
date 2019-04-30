package challenge1;

public class Question2 {
    static boolean isPalindrome(String testString) {
        String reverse = "";

        for (int i = 0; i < testString.length(); i++){
            char c = testString.charAt(i);
            reverse = c + reverse;
        }

        if (testString.equals(reverse)) { return true; }
        else { return false; }
    }

    public static void main(String[] args) {
        String testString = "bob";
        String testString2 = "jeff";
        System.out.println(isPalindrome(testString));
        System.out.println(isPalindrome(testString2));
    }
}
