package DSA.Binary_Search;

public class Search_In_Rotated_Sorted_Array {
    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int answer = search(nums, target);
        System.out.println(answer);
    }
    static int search(int[] nums, int target){
        int pivot = checkRotatingArray(nums);
        int half = searchHalf(nums, target, 0, pivot);

        if(half != -1){
            return half;
        }
        return searchHalf(nums, target, pivot + 1, nums.length - 1);
    }
    static int checkRotatingArray(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(start == end){
                return mid;
            }
            if (nums[mid] > nums[mid + 1]){
                end = mid;
            }
            else if(nums[mid] < nums[mid + 1]){
                start = mid + 1;
            }
        }
        return -1;
    }
    static int searchHalf(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                return -1;
            }
        }
        return -1;
    }
}
