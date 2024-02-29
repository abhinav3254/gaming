package code;

import java.util.Scanner;

public class AirConditiner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (b >= a && b >= c)
                System.out.println("YES");
            else
                System.out.println("no");

        }
        sc.close();
    }
}