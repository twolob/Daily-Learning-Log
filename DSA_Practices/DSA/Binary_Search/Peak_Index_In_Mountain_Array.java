package DSA.Binary_Search;

public class Peak_Index_In_Mountain_Array {
    public static void main(String[] args){
        int[] arr = {0,1,0};
        int ans = binarySearch(arr);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(start == end){
                return mid;
            }
            else if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
        }
        return -1;
    }
}
