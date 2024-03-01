package code;

import java.util.Scanner;

public class FillCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int pockets = sc.nextInt();
            int max = sc.nextInt();
            max *= pockets;
            if (n % max == 0)
                System.out.println(n / max);
            else
                System.out.println((n / max) + 1);
        }
        sc.close();
    }
}
