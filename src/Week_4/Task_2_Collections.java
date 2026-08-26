package Week_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_2_Collections {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        System.out.println("Enter the number of students : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of student " + (i + 1) + " : ");
            String name = sc.next();
            students.add(name);
        }

        System.out.println("\nAll student names : ");
        displayNames(students);

        removeNames(students);

        searchName(students);

        displayCollection(students);
    }

    public static void displayNames(ArrayList<String> a) {

        for (String name : a) {
            System.out.print(name + " ");
        }

        System.out.println();
    }

    public static boolean searchName(ArrayList<String> a) {

        System.out.println("Enter the name to search : ");
        String name = sc.next();

        if (a.contains(name)) {
            System.out.println("Student found...!");
            return true;
        }

        System.out.println("Student not found...!");
        return false;
    }

    public static void removeNames(ArrayList<String> a) {

        System.out.println("\nEnter the name to remove : ");
        String name = sc.next();

        if (a.contains(name)) {
            a.remove(name);
            System.out.println("Name removed successfully...!");
        }
        else {
            System.out.println("Name not found in the list.");
        }
    }

    public static void displayCollection(ArrayList<String> a) {

        System.out.println("\nFinal collection : ");
        System.out.println(a);
    }
}