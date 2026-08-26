package Week_4;

import java.util.HashMap;
import java.util.Scanner;

public class Task_4_HashMap {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        // Adding student records
        students.put(101, "Prathmesh");
        students.put(102, "Rahul");
        students.put(103, "Amit");
        students.put(104, "Sneha");
        students.put(105, "Priya");

        // Display all records
        System.out.println("All Student Records : ");
        System.out.println(students);

        // Search student using Student ID
        System.out.println("\nEnter Student ID to search : ");
        int id = sc.nextInt();

        if (students.containsKey(id)) {
            System.out.println("Student Found : " + students.get(id));
        }
        else {
            System.out.println("Student not found...!");
        }

        // Remove a student record
        System.out.println("\nEnter Student ID to remove : ");
        int removeId = sc.nextInt();

        if (students.containsKey(removeId)) {
            students.remove(removeId);
            System.out.println("Student record removed successfully...!");
        }
        else {
            System.out.println("Student ID not found...!");
        }

        // Display updated records
        System.out.println("\nUpdated Student Records : ");
        System.out.println(students);

        sc.close();
    }
}