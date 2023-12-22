package DSA.Binary_Search;

public class BinarySearch1 {
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;
        search(arr, target);
    }
    static void search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                System.out.println(target + " is found!");
                return;
            }
        }
        System.out.println(target + " not found!");
    }
}
