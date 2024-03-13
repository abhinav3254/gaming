package starters_125;

import java.util.Scanner;

public class NGRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int attendance = sc.nextInt();
            int marks = sc.nextInt();

            if (attendance < 50)
                System.out.println("Z");
            else if (marks < 50 && attendance >= 50)
                System.out.println("F");
            else
                System.out.println("A");

        }

        sc.close();
    }
}
