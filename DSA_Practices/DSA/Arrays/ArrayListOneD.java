package DSA.Arrays;

//Importing libraries
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListOneD {
    public static void main(String[] args){
        /*
            1) Write a program using ArrayList that will take 10 numbers input
            from the user and sum all ten of the numbers.

            2) Use another function for the calculation
         */
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();

        ArrayListSum(myList, input);
    }

    static void ArrayListSum(ArrayList<Integer> list, Scanner input){
        System.out.print("Enter 10 numbers: ");
        for (int index = 0; index < 10; index++){
            list.add(index, input.nextInt());
        }

        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println(sum);
    }
}
