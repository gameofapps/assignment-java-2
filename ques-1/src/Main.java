import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    private static void findPairs(int[] testArray, int targetSum) {
        HashMap<Integer, Integer> tempList = new HashMap<>();

        for (int i = 0; i < testArray.length; i++){
            int searchValue = targetSum - testArray[i];

            if (tempList.containsKey(searchValue)){
                System.out.println("(" + testArray[i] + ", " + searchValue + ")");
                tempList.remove(searchValue);
            } else {
                tempList.put(testArray[i], i);
            }
        }
    }


    public static void main (String args[]){
//        int[] testArray = {2, 4, 5, 1, 3, 5, 4};
//        int targetSum = 6;
//        findPairs(testArray, targetSum);
    }
}
