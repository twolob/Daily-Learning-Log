package DSA.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        /*
            1) Write a program the reverse an array
         */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //Calling the Method
        reverseArray(arr);
    }

    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int temp;

        for(int i = 0; i < arr.length; i++){
            if(start == end){
                for (int num : arr){
                    System.out.print(num);
                }
            }
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

}
