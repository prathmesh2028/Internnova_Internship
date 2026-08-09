package Week_1;

import java.util.Scanner;

public class JavaFundamentals_practise {
    public static void main(String[] args) {
//        Accepts an integer, float, and double value from the user.
//                Displays each value.
//        Perform both implicit and explicit type casting wherever applicable.
//                Print the values before and after type casting.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any integer value :");
        int intval = sc.nextInt();
        System.out.println("Enter any float value :");
        float floatval = sc.nextFloat();
        System.out.println("Enter any double value : ");
        double doubleval = sc.nextDouble();

        System.out.println("Values before type casting.....");
        System.out.println(intval + " " + floatval + " " + doubleval);

        // explicit type conversion
        // float value to int value
        intval = (int)floatval;

        //implicit type conversion
        // int value to float value
        floatval = intval;

        System.out.println("Values after type casting ......");
        System.out.println(intval + " " + floatval + " " + doubleval);
    }
}
