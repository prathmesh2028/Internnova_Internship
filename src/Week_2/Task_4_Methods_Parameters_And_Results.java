package Week_2;

import java.util.Scanner;

public class Task_4_Methods_Parameters_And_Results {
    public static void main(String[] args) {
//        Create methods for the following operations:
//
//        Find the square of a number.
//        Find the cube of a number.
//        Find the average of three numbers.
//        Find the maximum of two numbers.
//
//        Each method should accept parameters and return the appropriate result.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        System.out.println(sqr(x));
        System.out.println(cube(x));

        // average and maximum of two
        System.out.println(avg(3,6,5));
        System.out.println(maximumOfTwo(100,2345678));

    }
    public static int sqr(int n)
    {
        return n*n;
    }
    public static int cube(int n)
    {
        return n*n*n;
    }
    public static double avg(int a , int b , int c)
    {
        int sum = a+b+c;
        return sum/3;
    }
    public static int maximumOfTwo(int a , int b)
    {
        return Math.max(a,b);
    }
}
