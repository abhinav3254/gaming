package code;

import java.util.Scanner;

public class CupFinals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = sc.nextInt();
            a -= b;
            if (a < 0)
                a *= -1;
            if (a <= d)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        sc.close();
    }
}
