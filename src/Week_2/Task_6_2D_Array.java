package Week_2;

import java.util.Scanner;

public class Task_6_2D_Array {
    public static void main(String[] args) {
//        Create a Java program using a 2D array to store a 3 × 3 matrix.
//
//                The program should:
//
//        Take matrix elements as input.
//                Display the matrix in proper format.
//                Calculate and display the sum of all elements.

        Scanner sc = new Scanner(System.in);

        System.out.println("Taking input for 2D matrix");

        System.out.print("Enter the number of rows in 2D matrix : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns in 2D matrix : ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < cols ; j++)
            {
                System.out.print("Enter the element at " + i + " " + j +" : ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Printing the array : ");
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }


    }
}
