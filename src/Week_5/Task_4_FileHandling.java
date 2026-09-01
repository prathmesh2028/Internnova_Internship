package Week_5;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Task_4_FileHandling
{
    public static void main(String[] args)
    {
        // Student Information
        int studentId = 101;
        String studentName = "Prathmesh";
        String course = "Computer Engineering";
        double marks = 85.5;

        // File name
        String fileName = "student.txt";

        try
        {
            // Create a file
            File file = new File(fileName);

            if (file.createNewFile())
            {
                System.out.println("File created successfully.");
            }
            else
            {
                System.out.println("File already exists.");
            }

            // Write student information into the file
            FileWriter writer = new FileWriter(file);

            writer.write("Student ID: " + studentId + "\n");
            writer.write("Student Name: " + studentName + "\n");
            writer.write("Course: " + course + "\n");
            writer.write("Marks: " + marks + "\n");

            writer.close();

            System.out.println("Student information written successfully.");

            // Read information from the file
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            System.out.println("\n----- Student Information -----");

            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }

            bufferedReader.close();

            System.out.println("-------------------------------");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred while accessing the file.");
            System.out.println(e.getMessage());
        }
    }
}