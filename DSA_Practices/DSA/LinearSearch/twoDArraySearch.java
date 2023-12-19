package DSA.LinearSearch;

public class twoDArraySearch {
    public static void main(String[] args){
        //Search in an 2D array for a targeted value |
        // return a boolean value if found or not
        int[][] arrays = {
                {49, 30, 9},
                {22, 4, 10, 1},
                {2, 32}
        };
        int target = 10;
        //Printing the value from the searchFunction() method
        System.out.println(searchFunction(arrays, target));
    }
//
    static boolean searchFunction(int[][] arrays, int target){
        for (int i = 0; i < arrays.length; i++){
            for (int j = 0; j < arrays[i].length; j++){
                if (arrays[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
