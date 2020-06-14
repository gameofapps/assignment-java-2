public class Palindrome {
    public static boolean isPalindrome(String testString) {
        String normalizedString = testString.replaceAll("[^a-zA-Z]", "").trim().toLowerCase();
        char[] testCharArray = normalizedString.toCharArray();
        int stringLength = testCharArray.length - 1;

        for(int i = 0; i < (stringLength/2); i++) {
            if (testCharArray[i] != testCharArray[stringLength - i]) {
                return false;
            }
        }
        return true;
    }
}
