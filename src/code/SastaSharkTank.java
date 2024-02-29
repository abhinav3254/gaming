package code;

import java.util.Scanner;

public class SastaSharkTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            float a = sc.nextInt();
            float b = sc.nextInt();
            a = a * (100 / 10);
            b = b * (100 / 20);
            if (a == b)
                System.out.println("ANY");
            else if (a > b)
                System.out.println("FIRST");
            else if (b > a)
                System.out.println("SECOND");
        }
        sc.close();
    }
}
