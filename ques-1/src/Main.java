import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    private static void findPairs(int[] testArray, int targetSum) {
        ArrayList<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < testArray.length; i++){
            int searchValue = targetSum - testArray[i];

            if (tempList.contains(searchValue)){
                System.out.println("(" + testArray[i] + ", " + searchValue + ")");
                tempList.remove(Integer.valueOf(searchValue));
            } else {
                tempList.add(testArray[i]);
            }
        }
    }


    public static void main (String args[]){
//        int[] testArray = {8, 2, 2, 2, 2, 4, 5, 0};
//        int targetSum = 4;
//        findPairs(testArray, targetSum);
    }
}
