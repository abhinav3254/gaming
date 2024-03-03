package code;

import java.util.Scanner;

public class SpeedLimitTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double a = sc.nextDouble();
            double x = sc.nextDouble();
            double b = sc.nextDouble();
            double y = sc.nextDouble();
            a /= x;
            b /= y;
            if (a > b)
                System.out.println("Alice");
            else if (a < b)
                System.out.println("Bob");
            else
                System.out.println("equal");
        }
        sc.close();
    }
}