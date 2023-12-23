package DSA.Binary_Search;

public class SearchInsertPosition {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,6,7,8,9,10,11};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }
    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            if(target > nums[mid]){
                start = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return start;
    }
}