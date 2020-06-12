import java.util.LinkedList;
import java.util.Stack;

public class Main {

    private static boolean isPalindrome(String testString) {
        Stack<Character> stack = new Stack<>();
        String temp = "";

        for (int i = 0; i < testString.length(); i++){
            stack.push(testString.charAt(i));
        }
        while (!stack.empty()){
            temp = temp + String.valueOf(stack.pop());
        }

        return temp.equals(testString);
    }

    public static void main (String args[]){
//        if (!isPalindrome("radar")){
//            System.out.println("Mistake");
//        }
    }
}
