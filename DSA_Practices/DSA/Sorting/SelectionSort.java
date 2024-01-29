package DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {1, 6, 1, 8, 2, 78, 22, 0, 9, 93};
        selection(arr);
    }
    static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int smallest = arr[i];
            int count = i;
            for(int j = i; j < arr.length; j++){
                if(smallest > arr[j]){
                    smallest = arr[j];
                    count = j;
                }
            }
            //Swap
            swap(arr, i, count);
            count = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i, int count){
        int temp = arr[count];
        arr[count] = arr[i];
        arr[i] = temp;
    }
}