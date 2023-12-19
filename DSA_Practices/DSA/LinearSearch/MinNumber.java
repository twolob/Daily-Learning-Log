package DSA.LinearSearch;

public class MinNumber {
    public static void main(String[] args) {
        //Write a program the search for a minimum value and return the index
        int[] arr = {39, 4, 2, 9, 1, 34, 22, 6};
        System.out.println(minValue(arr));
    }

    static int minValue(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int compareValue = arr[0];
        int returnMe = 0;
        for (int index = 0; index < arr.length; index++){
            if(compareValue > arr[index]){
                compareValue = arr[index];
                returnMe = index;
            }
        }
        return returnMe;
    }
}
