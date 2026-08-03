import java.util.Scanner;

public class InputAndOutputUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name : ");
        String fullName = sc.nextLine();

        System.out.print("Enter your age : ");
        int age= sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your college name : ");
        String collegeName = sc.nextLine();


        System.out.print("Enter your branch name : ");
        String branch = sc.nextLine();

        System.out.println(fullName);
        System.out.println(age);
        System.out.println(collegeName);
        System.out.println(branch);
    }
}
