package DSA.Binary_Search;

public class CeilingWithBinarySearch {
    public static void main(String[] args){
        int[] arr = {21, 34, 55, 69, 83, 313, 925};
        int target = 80;
        System.out.println(ceilingSearch(arr, target));
    }
    static int ceilingSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while(start <= end){
            mid = start + (end - start)/2;
            if (target > arr[mid]){
                start = mid + 1;
            }else if(start < arr[mid]){
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return mid;
    }

}
