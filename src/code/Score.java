package code;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (c >= a && d >= b)
                System.out.println("Possible");
            else
                System.out.println("Impossible");
        }
        sc.close();
    }
}
