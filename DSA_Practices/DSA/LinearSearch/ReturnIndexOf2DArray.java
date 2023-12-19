package DSA.LinearSearch;

import java.util.Arrays;

public class ReturnIndexOf2DArray {
    public static void main(String[] args){
        //Search in a 2D array and return the index of the targeted value
        int[][] arr = {
                {84, 3, 29, 4},
                {22, 1, 11},
                {92, 40}
        };
        int target = 1;

        System.out.print(Arrays.toString(indexOf2DArray(arr, target)));
    }

    static int[] indexOf2DArray(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
