package code;

import java.util.Scanner;

public class PoliceAndThief {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            // int count = 0;

            // while (y > x) {
            // x += 2;
            // y += 1;
            // count++;
            // }

            // System.out.println(count);
            int dif = x - y;
            if (dif < 0)
                dif *= -1;
            System.out.println(dif);

        }
        sc.close();
    }
}
