package Week_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1_Exception_Handling_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        try{
            System.out.println("Enter the first number : ");
            num1 = sc.nextInt();
            System.out.println("Enter the second number : ");
            num2 = sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter a valid input...!");
            sc.nextLine();
            return;
        }

        int choice = 0;

        while(true)
        {
            System.out.println("Enter your choice :");
            System.out.println("1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Modulation\n6.Exit\n");
            choice = sc.nextInt();
            System.out.println();
            switch (choice){
                case 1:
                    System.out.println("Addition is : " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Subtraction is : " + (num1 - num2));
                    break;
                case 3:
                    try{
                        System.out.println("Division is : " + (num1 / num2));
                    }
                    catch(ArithmeticException e)
                    {
                        System.out.println("Zero is not divisible....!");
                    }
                    break;
                case 4:
                    System.out.println("Multiplication is : " + (num1 * num2));
                    break;
                case 5:
                    System.out.println("Modulus is : " + (num1 % num2));
                    break;
            }
            if(choice == 6) break;

        }



    }
}
