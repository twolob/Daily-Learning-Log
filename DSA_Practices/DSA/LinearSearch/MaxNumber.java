package DSA.LinearSearch;

public class MaxNumber {
    public static void main(String[] args){
        /*
            1) Write a program to find the targeted element of an array.
            2) Return the target if found, otherwise, return -1.
         */
        int[] arr = {18, 12, 9, 14, 77, 50};
        int target = 14;
        //calling the 'findMaxNum()' method
        System.out.println(findMaxNum(arr, target));
    }

    static int findMaxNum(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return target;
            }
        }
        return -1;
    }
}
