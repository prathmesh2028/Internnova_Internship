package Week_3;

class Employee2
{
    int id;
    String name;
    double salary;
    Employee2(int id , String name , double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

class Developer extends Employee2
{
    Developer(int id , String name , double salary)
    {
        super(id,name,salary);
    }
    String role;
    public void display()
    {
        System.out.println("Developer information");
        System.out.println("ID :- " + id + "\n" + "Name :- " + name + "\n" + "Salary :- " + salary);
    }
}
class Manager extends Employee2
{
    Manager(int id , String name , double salary)
    {
        super(id,name,salary);
    }
    public void display()
    {
        System.out.println("Manager information");
        System.out.println("ID :- " + id + "\n" + "Name :- " + name + "\n" + "Salary :- " + salary);
    }

}

public class Task_4_Inheritance {
    public static void main(String[] args) {
        Developer dev = new Developer(102 , "Prathmesh" , 500000);
        Manager manager = new Manager(401 , "Manashir" , 400000);

        dev.display();
        System.out.println();
        manager.display();
    }
}
