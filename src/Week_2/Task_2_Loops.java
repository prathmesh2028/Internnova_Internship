package Week_2;

public class Task_2_Loops {
    public static void main(String[] args) {
//        Print numbers from 1 to 100.
//        Print all even numbers between 1 and 100.
//        Print all odd numbers between 1 and 100.
//        Calculate the sum of numbers from 1 to 100.

        // printing numbers from 1 to 100
        for(int i = 1 ; i <= 100 ; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        //printing all even numbers between 1 to 100
        int j = 2;
        while(j <= 100)
        {
            System.out.print(j +  " ");
            j += 2;
        }
        System.out.println();

        //all odd numbers between 1 and 100
        for(int i = 1 ; i <= 100 ; i += 2)
        {
            System.out.print(i + " ");
        }
        System.out.println();


        // sum of numbers from 1 to 100
        int sum = 0;
        int k = 1;
        do {
            sum += k;
            k++;
        }while(k <= 100);
        System.out.println(sum);
    }
}
