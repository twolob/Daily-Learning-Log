package DSA.LinearSearch;

public class SearchNumberOfEvenNumber {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int sum = 0;
        int count = 0;
        for (int num : nums){
            while(num > 0){
                count++;
                num = num / 10;
            }
            if(count % 2 == 0){
                sum += 1;
            }
            count = 0;
        }
        return sum;
    }
}
