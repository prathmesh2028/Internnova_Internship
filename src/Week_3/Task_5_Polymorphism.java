package Week_3;

class Calculator
{
    public void add(int a , int b)
    {
        System.out.println("In add of int int");
        System.out.println("a + b = " + (a+b));
    }

    public void add(double a , double b)
    {
        System.out.println("in add of double double");
        System.out.println("a + b = " + (a+b));
    }

    public void add(int a , double b)
    {
        System.out.println("in add of int double");
        System.out.println("a + b = " + (a+b));
    }
}

class vehicle
{
    public void start() {
        System.out.println("Vehicle is starting...!");
    }
}

class Car extends vehicle
{
    @Override
    public void start()
    {
        System.out.println("Car is starting");
    }
}
class Bike extends vehicle
{
    @Override
    public void start()
    {
        System.out.println("Bike is starting");
    }
}

public class Task_5_Polymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(4,5);
        cal.add(4,6.9);
        cal.add(4.5,1.2);


        System.out.println();
        System.out.println();

        Car c = new Car();
        c.start();

        System.out.println();

        Bike b = new Bike();
        b.start();
    }
}
