package Week_5;

abstract class Shape
{
     double area;
    abstract void calculateArea();
    public void diaplayArea()
    {
        System.out.println("Area is " + area);
    }
}
class Circle extends Shape
{
    double r;
    Circle(double r)
    {
        this.r = r;
    }
    public void calculateArea()
    {
        System.out.println("Calculating area of circle");
        area = 3.14*r*r;
    }
}
class Rectangle extends Shape
{
    double l;
    double b;
    Rectangle(double l , double b)
    {
        this.l = l;
        this.b = b;

    }
    public void calculateArea()
    {
        System.out.println("Calculaiting area of rectangle");
        area = l*b;
    }
}

public class Task_3_AbstractClasses {
    public static void main(String[] args) {
        Circle c = new Circle(34);
        c.calculateArea();
        c.diaplayArea();

        Rectangle r = new Rectangle(2,9);
        r.calculateArea();
        r.diaplayArea();
    }
}
