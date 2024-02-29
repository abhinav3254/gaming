package code;

import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            double c = sc.nextDouble();

            double avg = (a + b) / 2;

            if (avg > c)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        sc.close();
    }

}
