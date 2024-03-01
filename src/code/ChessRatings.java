package code;

import java.util.Scanner;

public class ChessRatings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            b = b - a;
            if (b % 8 == 0)
                System.out.println(b / 8);
            else
                System.out.println((b / 8) + 1);
        }
        sc.close();
    }
}
