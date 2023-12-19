package DSA.Arrays;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListTwoD {
    public static void main(String[] args) {
        /*
            1) Take an input of 6 digits and print it in a rows and columns format
            2) Use another function
         */
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //Calling the function
        metric(input, list);
    }

    static void metric(Scanner input, ArrayList<ArrayList<Integer>> list){
        for (int i = 0; i < 3; i++){
            list.add(new ArrayList());
        }

        System.out.print("Enter six numbers:");
        for (int i = 0; i < 6; i++){
            list.get(i).add(input.nextInt());
        }

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; i++){
                System.out.print(list.get(j));
            }
            System.out.println();
        }
    }
}
