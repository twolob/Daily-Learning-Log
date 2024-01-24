package DSA.Sorting;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {3, 6, 1, 8, 2, 9};
    }
    static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int count = -1;
            int smallest = arr[0];
            for(int j = i; j < arr.length; j++){
                if(smallest > arr[j]){
                    smallest = arr[j];
                }
            }

        }
    }
    static void swap(int smallest, int[] arr){
        int temp;
    }
}
