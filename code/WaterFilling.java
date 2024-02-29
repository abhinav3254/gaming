package code;

import java.util.Scanner;

public class WaterFilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            int b3 = sc.nextInt();

            int sum = b1 + b2 + b3;

            if (sum < 2)
                System.out.println("Water filling time");
            else
                System.out.println("Not now");

        }
        sc.close();
    }
}
