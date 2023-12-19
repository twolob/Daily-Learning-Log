package DSA.LinearSearch;

public class SearchNumberOfEvenNumber {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                sum += 1;
            }
        }
        return sum;
    }
}
