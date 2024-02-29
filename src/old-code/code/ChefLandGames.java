package code;

import java.util.Scanner;

public class ChefLandGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int sum = a + b + c + d;

            if (sum == 0)
                System.out.println("IN");
            else
                System.out.println("OUT");

        }
        sc.close();
    }
}