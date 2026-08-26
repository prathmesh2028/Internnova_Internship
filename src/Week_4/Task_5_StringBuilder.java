package Week_4;

import java.util.Scanner;

public class Task_5_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Software Engineer ");
        System.out.println(sb);
        sb.append("Developer ");
        System.out.println(sb);
        sb.insert(9 , "cloud ");
        System.out.println(sb);
        sb.replace(0,7 , "Cloud ");
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb);

    }
}
