package Week_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_5_1D_Array {
    public static void main(String[] args) {
//        Create a Java program that:
//
//        Stores marks of 5 students in a 1D array.
//                Takes marks as input from the user.
//        Displays all the marks.
//        Calculates and displays:
//        Total marks
//        Average marks
//        Highest marks
//        Lowest marks

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int n = sc.nextInt();

        int[] students = new int[n];

        System.out.println("Enter the marks of all students ....");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print("Enter marks of " + i + " : ");
            students[i] = sc.nextInt();
        }

        System.out.println("All the marks of all students are as shown below ...");
        System.out.println(Arrays.toString(students));

        // displaying total marks
        System.out.println("Total marks are : " + Arrays.stream(students).sum());

        System.out.println("Average marks are : " + Arrays.stream(students).average().orElse(0.0));

        System.out.println("Maximum marks are : " + Arrays.stream(students).max().orElse(0));

        System.out.println("Minimum marks are : " + Arrays.stream(students).min().orElse(0));
    }
}
