package studentmanagement;

public class Student {
    public Student()
    {
        ID = 1;
        name = "null";
        course = "invalid";
    }
    public int ID;
    public String name;
    public String course;
    public Student(int ID, String name, String course)
    {
        this.ID = ID;
        this.name = name;
        this.course = course;
    }
}
