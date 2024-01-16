package Algorithms;

public class Two_Sum {
    public static void main(String[] arg){
        int[] numbers = {-1,0};
        int target = -1;
    }
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(start == mid || end == mid){
                return new int[] {-1, -1};
            }
            
        }
    }
}