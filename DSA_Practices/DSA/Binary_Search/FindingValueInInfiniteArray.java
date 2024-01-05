//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
package DSA.Binary_Search;

public class FindingValueInInfiniteArray {
    public static void main(String[] args){
        int[] nums = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        int ans = checkingTarget(nums, target);
        System.out.println(ans);
    }
    static int checkingTarget(int[] nums, int target){
        int start = 0;
        int end = 1;

        while(target > nums[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return searchTarget(nums, target, start, end);
    }
    static int searchTarget(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
