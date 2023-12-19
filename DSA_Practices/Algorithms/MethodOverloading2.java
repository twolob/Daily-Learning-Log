package Algorithms;

public class MethodOverloading2 {
    public static void main(String[] args){
        methodOverloading(10);
        methodOverloading(20, 30);
    }

    static void methodOverloading(int num1, int num2){
        System.out.println("I took: " + num1 + " & " + num2);
    }

    static void methodOverloading(int num3){
        System.out.println("I am: " + num3);
    }
}
