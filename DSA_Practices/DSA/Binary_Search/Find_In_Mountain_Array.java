//https://leetcode.com/problems/find-in-mountain-array/
package DSA.Binary_Search;

public class Find_In_Mountain_Array {
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 5, 4, 3, 2, 1};
        int target = 2;
        int answer = search(arr, target);
        System.out.println(answer);
    }
    static int search(int[] arr, int target){
        int peak = peakOfMountainArray(arr);
        int firstHalf = orderOfBinarySearch(arr, target, 0, peak);
        if(firstHalf != -1){
            return firstHalf;
        }
        return orderOfBinarySearch(arr, target, peak  + 1, arr.length - 1);
    }
    static int peakOfMountainArray(int[] arr){
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
    static int orderOfBinarySearch(int[] arr, int target, int start, int end){
        boolean firstHalf = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(firstHalf){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    return mid;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else if(target < arr[mid]){
                    start = mid + 1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
    }
}
