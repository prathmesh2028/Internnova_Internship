package Week_2;

import java.util.Scanner;

public class Task_3_Methods {
    public static void main(String[] args) {
//        Create a calculator program using separate methods for:
//
//        Addition
//                Subtraction
//        Multiplication
//                Division
//        Modulus
//
//        Take two numbers as input from the user and call the appropriate methods to perform the operations.


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int x = sc.nextInt();
        System.out.print("Enter the second number :");
        int y = sc.nextInt();

        System.out.println("Addition of these two numbers is " + add(x,y));
        System.out.println("Subtraction of these two numbers is " + sub(x,y));
        System.out.println("Multiplication of these two numbers is " + mul(x,y));
        System.out.println("Division of these two numbers is " + div(x,y));



    }
    public static int add(int a , int b)
    {
        return (a+b);
    }
    public static int sub(int a , int b)
    {
        return (a-b);
    }
    public static int mul(int a , int b)
    {
        return a*b;
    }
    public static double div(int a, int b)
    {
        double x = (double)a;
        return x/b;
    }
}
