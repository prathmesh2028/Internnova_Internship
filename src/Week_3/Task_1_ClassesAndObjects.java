package Week_3;

class Student
{
    String name;
    int rollNo;
    String branch;
    double cgpa;
    Student(String name , int rollNo , String branch , double cgpa)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    // display the information of the student in proper format
    public void display()
    {
        System.out.println(this.name + " " + this.branch+ " " + rollNo + " " + cgpa);
    }
}

public class Task_1_ClassesAndObjects {
    public static void main(String[] args) {
        Student s1 = new Student("Prathmesh" , 42 , "Information Technology" , 9.9);
        Student s2 = new Student("Rajaram" , 99, "Mechanical Engineering" , 8.9);
        Student s3 = new Student("Bhavesh" , 32, "Computer Engineering" , 7.6);

        System.out.println(s1.name);
        System.out.println(s1.branch);
        System.out.println(s1.cgpa);

        s1.display();
        s2.display();
        s3.display();
    }
}
