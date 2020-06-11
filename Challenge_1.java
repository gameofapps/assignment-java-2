import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    findPairs(new int[]{2, 4, 5, 1, 3, 5, 4}, 6);
    System.out.println(isPalindrome("moddom"));
  }

  static void findPairs(int[] testArray, int targetSum) {
    ArrayList<String> dups = new ArrayList<>();
    for(int i = 0;i<testArray.length;i++){
      for(int j = i+1;j<testArray.length;j++){
        int max = Math.max(testArray[i],testArray[j]);
        int min = Math.min(testArray[i],testArray[j]);
        if(min+max == targetSum && !dups.contains(min+" "+max)){
          dups.add(min+" "+max);
          System.out.println("("+min+", "+max+")");
        }
      }
    }
  }

  static boolean isPalindrome(String testString) {
    String[] string = testString.split("");
    for(int i = 0;i<Math.floor(string.length/2.0);i++){
      System.out.println(string[i]+" "+string[string.length-i-1]);
      if(!string[i].equals(string[string.length-i-1])){
        return false;
      }
    }
    return true;
  }
}