package DSA.Binary_Search;

public class AnyOrderOfBinarySearch {
    public static void main(String[] args){
//        int[] arr = {1, 3, 5, 6, 7, 8, 9};
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 1};
        int target = 7;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAs = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (isAs){
                if (target > arr[mid]){
                    start = mid + 1;
                }
                else if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    return mid;
                }
            }
            else {
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else if (target < arr[mid]) {
                    start = mid + 1;
                }
                else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
