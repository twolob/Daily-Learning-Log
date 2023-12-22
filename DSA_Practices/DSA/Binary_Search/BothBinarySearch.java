package DSA.Binary_Search;

public class BothBinarySearch {
    public static void main(String[] args){
//        int[] arr3 = {86, 64, 41, 35, 23, 11, 6, 3, 1};
        int[] arr3 = {2, 4, 6, 7, 8, 9, 11};
        int target = 11;
        int answer = bothSearch(arr3, target);
        System.out.println("Index: " + answer);
    }
    static int bothSearch(int[] arr3, int target){
        int start = 0;
        int end = arr3.length - 1;

        if(arr3[start] < arr3[end]){
            while (start <= end){
                int mid = start + (end - start) / 2;

                if(target > arr3[mid]){
                    start = mid + 1;
                }
                else if(target < arr3[mid]){
                    end = mid - 1;
                }
                else {
                    return mid;
                }
            }
        }
        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr3[mid]){
                end = mid - 1;
            }
            else if(target < arr3[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return  -1;
    }
}
