package Algorithms;
import java.util.Arrays;
public class Two_Sum {
    public static void main(String[] arg){
        int[] numbers = {-1,0};
        int target = -1;
        System.out.println(Arrays.toString((twoSum(numbers, target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(start == end){
                return new int[] {-1, -1};
            }
            if((numbers[start] + numbers[mid]) == target){
                return new int[] {start, mid};
            } else if((numbers[start] + numbers[mid]) > target) {
                end = mid;
            }else{
                start = mid;
            }

        }
        return new int[] {-1, -1};
    }
}