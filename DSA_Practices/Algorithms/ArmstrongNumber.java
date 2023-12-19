package Algorithms;

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Check if a number is Armstrong or not: ");
        int number = scan.nextInt();
        checkingArmstrong(number);
    }

    static void checkingArmstrong(int number){
        int original = number;
        int reminder = 0;
        int sum = 0;

        while(number > 0){
            reminder = number % 10;
            sum += (reminder * reminder * reminder);
            number /= 10;
        }
        if(original == sum){
            System.out.println(original + " is an Armstrong number.");
            return;
        }
        System.out.println(original + " is not an Armstrong number.");

    }
}
