package Week_3;

class Employee
{
    int id;
    String name;
    String department;
    double salary;
    public void display()
    {
        System.out.println(name + " " + department + " " + id + " " + salary);
    }
    // default constructor for employee class
    Employee()
    {
        id = 1;
        name = "unknown";
        department = "not specified";
        salary = 0.0;

        System.out.println("In default constructor of employee class");
    }

    // parameterized constructor
    Employee(int id , String name , String department , double salary)
    {
        System.out.println("In parameterized constructor of employee class");
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        System.out.println("Employee added successfully....!");
    }
}

public class Task_2_COnstructors {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.display();
        System.out.println();
        Employee e2 = new Employee(101 , "Tanmay" , "HR" , 50000.00);
        e2.display();
    }
}
