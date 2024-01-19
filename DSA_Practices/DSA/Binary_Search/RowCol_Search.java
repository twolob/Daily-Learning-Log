package DSA.Binary_Search;
import java.util.Arrays;

public class RowCol_Search {
    public static void main(String[] args){
        int[][] arr = {
                {3, 5, 9},
                {4, 7, 11},
                {6, 8, 17}
        };
        int target = 6;
        String ans = Arrays.toString(searchMatrix(arr, target));
        System.out.println(ans);
    }
    static int[] searchMatrix(int[][] arr, int target){
        int row = 0;
        int col = arr.length - 1;

        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[] {row, col};
            }
            else if(arr[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[] {row, col};
    }
}
