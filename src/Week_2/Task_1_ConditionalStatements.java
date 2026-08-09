package Week_2;

import jdk.jfr.Percentage;

import java.util.Scanner;

public class Task_1_ConditionalStatements {
    public static void main(String[] args) {
//        Takes marks of a student in 3 subjects as input.
//                Calculates the total marks and percentage.
//                Uses conditional statements to determine the result.
//        Display:
//        Student Name
//        Total Marks
//        Percentage
//                Result

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.print("Enter your subject 1 marks :");
        double marks1 = sc.nextInt();
        System.out.print("Enter your subject 2 marks :");
        double marks2 = sc.nextInt();
        System.out.print("Enter your subject 3 marks :");
        double marks3 = sc.nextInt();

        double percentage = ((marks1+marks2+marks3)/300) * 100 ;

        if(percentage >= 90)
        {
            System.out.println("A+ " + percentage);
        }
        else if(percentage <= 80 && percentage >= 70)
        {
            System.out.println("A " + percentage);
        }
        else if(percentage <= 70 && percentage >= 60)
        {
            System.out.println("B+ " + percentage);
        }
        else if(percentage <= 60 && percentage >= 50)
        {
            System.out.println("B");
        }
        else System.out.println("You failed the exam....!\nbetter luck next time...!");

    }
}
