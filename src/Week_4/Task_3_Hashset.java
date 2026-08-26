package Week_4;

import java.util.HashSet;
import java.util.Scanner;

public class Task_3_Hashset {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        HashSet<String> courses = new HashSet<>();

        // Adding course names
        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("JavaScript");
        courses.add("SQL");
        courses.add("HTML");
        courses.add("CSS");

        // Adding duplicate courses
        courses.add("Java");
        courses.add("Python");

        System.out.println("Final HashSet : ");
        System.out.println(courses);

        // Demonstrating duplicate values are not stored
        System.out.println("\nTotal courses stored : " + courses.size());
        System.out.println("Duplicate Java and Python are not stored again.");

        // Searching for a particular course
        System.out.println("\nEnter the course to search : ");
        String course = sc.next();

        if (courses.contains(course)) {
            System.out.println("Course found...!");
        }
        else {
            System.out.println("Course not found...!");
        }

        sc.close();
    }
}