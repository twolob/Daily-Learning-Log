package Algorithms;

public class MethodOverloading1 {
    public static void main(String[] args){
        methodOverloading(29);
        methodOverloading("Thomas");
    }

    static void methodOverloading(int age){
        System.out.println("My age is: " + age);
    }

    static  void methodOverloading(String name){
        System.out.println("My name is: " + name);
    }
}
