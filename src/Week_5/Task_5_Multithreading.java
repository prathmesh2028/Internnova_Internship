package Week_5;
class NumberThread extends Thread
{
    public void run()
    {
        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.println("i : " + i);
            try{
                Thread.sleep(500);

            } catch (InterruptedException e) {
                System.out.println("Thread 1 Interrupted");
            }
        }

    }
}
class MessageThread extends Thread
{
    public void run()
    {
        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.println("Learning Java Multithreading\n");
            try{
                Thread.sleep(500);

            } catch (InterruptedException e) {
                System.out.println("Thread 1 Interrupted");
            }
        }

    }
}
public class Task_5_Multithreading {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread();
        MessageThread t2 = new MessageThread();

        t1.start();
        t2.start();
    }
}
