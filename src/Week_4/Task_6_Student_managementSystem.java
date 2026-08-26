package Week_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Task_6_Student_managementSystem {

    static Scanner sc = new Scanner(System.in);

    // HashMap -> Student ID as Key, Student object as Value
    static HashMap<Integer, Student> students = new HashMap<>();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Student Record Manager =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Display Unique Courses");
            System.out.println("6. Exit");

            try {
                System.out.print("\nEnter your choice : ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        addStudent();
                        break;

                    case 2:
                        viewStudents();
                        break;

                    case 3:
                        searchStudent();
                        break;

                    case 4:
                        removeStudent();
                        break;

                    case 5:
                        displayUniqueCourses();
                        break;

                    case 6:
                        System.out.println("Exiting Student Record Manager...!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid menu choice! Please enter a number between 1 and 6.");
                }

            }
            catch (InputMismatchException e) {
                System.out.println("Invalid numeric input! Please enter numbers only.");
                sc.nextLine();
            }
        }
    }

    // 1. Add Student
    public static void addStudent() {

        try {

            System.out.print("\nEnter Student ID : ");
            int id = sc.nextInt();

            // Check whether Student ID already exists
            if (students.containsKey(id)) {
                System.out.println("Student ID already exists! Please use a unique ID.");
                return;
            }

            if (id <= 0) {
                System.out.println("Invalid Student ID! ID must be greater than 0.");
                return;
            }

            sc.nextLine();

            System.out.print("Enter Student Name : ");
            String name = sc.nextLine();

            if (name.trim().isEmpty()) {
                System.out.println("Student name cannot be empty.");
                return;
            }

            System.out.print("Enter Course : ");
            String course = sc.nextLine();

            if (course.trim().isEmpty()) {
                System.out.println("Course cannot be empty.");
                return;
            }

            System.out.print("Enter Age : ");
            int age = sc.nextInt();

            if (age <= 0 || age > 100) {
                System.out.println("Invalid age!");
                return;
            }

            Student student = new Student(id, name, course, age);

            students.put(id, student);

            System.out.println("Student added successfully...!");

        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter the correct data type.");
            sc.nextLine();
        }
    }

    // 2. View Students
    public static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("\nNo student records available.");
            return;
        }

        System.out.println("\n===== Student Records =====");

        for (Map.Entry<Integer, Student> entry : students.entrySet()) {

            Student student = entry.getValue();

            System.out.println(student.getStudentDetails());
            System.out.println("----------------------------");
        }
    }

    // 3. Search Student
    public static void searchStudent() {

        try {

            System.out.print("\nEnter Student ID to search : ");
            int id = sc.nextInt();

            if (students.containsKey(id)) {

                Student student = students.get(id);

                System.out.println("\nStudent Found!");
                System.out.println(student.getStudentDetails());

            }
            else {
                System.out.println("Student with ID " + id + " does not exist.");
            }

        }
        catch (InputMismatchException e) {
            System.out.println("Invalid Student ID! Please enter a numeric ID.");
            sc.nextLine();
        }
    }

    // 4. Remove Student
    public static void removeStudent() {

        try {

            System.out.print("\nEnter Student ID to remove : ");
            int id = sc.nextInt();

            if (students.containsKey(id)) {

                students.remove(id);

                System.out.println("Student with ID " + id +
                        " removed successfully...!");

            }
            else {
                System.out.println("Student with ID " + id + " does not exist.");
            }

        }
        catch (InputMismatchException e) {
            System.out.println("Invalid Student ID! Please enter a numeric ID.");
            sc.nextLine();
        }
    }

    // 5. Display Unique Courses
    public static void displayUniqueCourses() {

        if (students.isEmpty()) {
            System.out.println("\nNo student records available.");
            return;
        }

        HashSet<String> uniqueCourses = new HashSet<>();

        for (Student student : students.values()) {
            uniqueCourses.add(student.getCourse());
        }

        System.out.println("\n===== Unique Courses =====");

        for (String course : uniqueCourses) {
            System.out.println(course);
        }
    }
}


// Student class
class Student {

    private int studentId;
    private String studentName;
    private String course;
    private int age;

    public Student(int studentId, String studentName, String course, int age) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    // StringBuilder used meaningfully for formatting student information
    public String getStudentDetails() {

        StringBuilder sb = new StringBuilder();

        sb.append("Student ID   : ").append(studentId).append("\n");
        sb.append("Student Name : ").append(studentName).append("\n");
        sb.append("Course       : ").append(course).append("\n");
        sb.append("Age          : ").append(age);

        return sb.toString();
    }
}