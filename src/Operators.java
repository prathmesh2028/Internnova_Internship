import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        // calculator program

        // scanner class
        Scanner sc = new Scanner(System.in);

        //taking input from the user
        System.out.print("Enter the first number :");
        int x = sc.nextInt();
        System.out.print("Enter the second number : ");
        int y = sc.nextInt();

        System.out.println("Enter your choice :-");
        System.out.println("1 : Addition");
        System.out.println("2 : Subtraction");
        System.out.println("3 : Division");
        System.out.println("4 : Multiplication");
        System.out.println("5 : Exit");
        System.out.print("Your choice :- ");

        int choice = sc.nextInt();

        while(choice > 0 && choice <= 5)
        {
            if(choice == 1)
            {
                System.out.println("Addition of two numbers is " + (x + y));
                System.out.print("Your choice :- ");
                choice = sc.nextInt();
            }
            else if (choice == 2)
            {
                System.out.println("Subtraction of two numbers is " + (x - y));
                System.out.print("Your choice :- ");
                choice = sc.nextInt();
            }
            else if (choice == 3)
            {
                System.out.println("Division of two numbers is " + (x / y));
                System.out.print("Your choice :- ");
                choice = sc.nextInt();
            }
            else if (choice == 4)
            {
                System.out.println("Multiplication of two numbers is " + (x * y));
                System.out.print("Your choice :- ");
                choice = sc.nextInt();
            }
            else if (choice == 5)
            {
                System.out.println("Exiting the program....!");
                break;
            }
            else
            {
                System.out.println("Invalid choice entered....!");
            }
        }

    }
}
