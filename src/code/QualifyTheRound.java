package code;

import java.util.Scanner;

public class QualifyTheRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            b *= 2;

            if (a + b >= x)
                System.out.println("Qualify");
            else
                System.out.println("NotQualify");

        }
        sc.close();
    }
}
