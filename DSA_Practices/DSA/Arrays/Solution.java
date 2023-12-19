package DSA.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int myLength = nums1.length + nums2.length;
        int[] mergedArray = new int[myLength];
        int i = 0;
        for (int index = 0; index < mergedArray.length; index++){
            if (index < nums1.length){
                mergedArray[index] = nums1[index];
            }
            else {
                mergedArray[index] = nums2[i];
                i++;
            }

        }

        int start = 0;
        int end = mergedArray.length - 1;

       if (mergedArray.length % 2 == 0){
           start = 1;
           for (int index = 0; index < mergedArray.length; index++){
               if(start == end){
                   start -= 1;
                   double result = (mergedArray[start] + mergedArray[end]) / 2;
                   return result;
               }
               start++;
               end--;
           }
       }
       else {
           for (int index = 0; index < mergedArray.length; index++){
               if(start == end){
                   int result = (mergedArray[start] + mergedArray[end]) / 2;
                   return result;
               }
               start++;
               end--;
           }
       }
        return -1;
    }
}