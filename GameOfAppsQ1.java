/*Name: Kevin Lin
 *Date: 4/20/2019
 *Purpose: To complete the Game of apps assignment of creating an algorithm 
 *         that can find pairs in an aray that add up to a target sum
 */


public class GameOfAppsQ1{
    
    public static void main(String[] args) {

        //Enter values here to find a result
        int[] testArray = { 2, 4, 5, 1, 3, 5, 4 };
        int targetSum = 6;
        
        //calling the function 
        findPairs(testArray, targetSum);
    }

    //defining the function
    public static void findPairs(int[] testArray, int targetSum) {
        //finding how many numbers are in the aray and initializing necessary variables and arrays
        int size = testArray.length;
        int solutionsFound = 0;
        int[] pair1 = new int[size];
        int[] pair2= new int[size];

        //searching for pairs and sticking them into two arrays, and also counting how many pairs have been found
        for (int i=0;i<size;i++){
            for(int j =i+1;j<size;j++){
                 if((testArray[i]+testArray[j])==targetSum){
                    pair1[solutionsFound]=testArray[i];
                    pair2[solutionsFound]=testArray[j];
                    solutionsFound++;
                }
            }
        }
        //printing out the pairs
        System.out.println("Solutions found: "+solutionsFound);
        for(int k=0;k<solutionsFound;k++){
            System.out.println("Pair #"+(k+1)+" "+pair1[k]+","+pair2[k]);
        }
    }
    

}
