package Algorithms;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //Ask the user to input a value
        System.out.print("Check if a number is prime or not: ");
        int prime = scan.nextInt();
        primeMethod(prime);
    }

    static void primeMethod(int prime){
        int number = 2;
        while (prime >= number){
            if(prime % number == 0){
                System.out.println(prime + " is not a prime number.");
                return;
            } else if (prime == number) {
                System.out.println(prime + " is a prime number.");
                return;
            }
            number ++;
        }
    }
}
