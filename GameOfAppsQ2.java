/*Name: Kevin Lin
 *Date: 4/20/2019
 *Purpose: To complete the gameofapps task of checking if a word is a palindrome
 */


public class GameOfAppsQ2{
    
    public static void main(String[] args) {

      //Enter values here to find a result
      String testString1="racecar";
        
      //calling the function 
      boolean String1 = isPalindrome(testString1);
      if(String1==true){
        System.out.println(testString1+" is a palindrome");
      } else {
        System.out.println(testString1+" is NOT a palindrome");
      }
    }

    //defining the function
     static boolean isPalindrome(String testString) {
      int length=testString.length();
      int halfLength=length/2;
      char[] stringToCharArray=testString.toCharArray();
      for (int i=0;i<halfLength;i++){
          if(!(stringToCharArray[i]==stringToCharArray[length-i-1])){
            return false;
          }
      }
      return true;

    }
    

}
