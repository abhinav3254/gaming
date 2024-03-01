package code;

import java.util.Scanner;

public class WaterMixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int initial = sc.nextInt();
            int toSet = sc.nextInt();
            int hotWater = sc.nextInt();
            int coldWater = sc.nextInt();
            if (toSet > initial) {
                int ans = initial + hotWater;
                if (ans >= toSet)
                    System.out.println("yes");
                else
                    System.out.println("no");
            } else {
                int ans = initial - coldWater;
                if (ans <= toSet)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
        }
        sc.close();
    }
}
