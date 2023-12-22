package DSA.Binary_Search;

public class BinarySearch2 {
    public static void main(String[] args){
        int[] arr2 = {93, 54, 27, 9, 6, 3, 1};
        int target = 9;
        int answer = search(arr2, target);
        System.out.println("Index: " + answer);
    }
    static int search(int[] arr2, int target){
        int start = 0;
        int end = arr2.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr2[mid]){
                end = mid - 1;
            }
            else if (target < arr2[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
