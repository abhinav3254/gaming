package code;

import java.util.Scanner;

public class ChefAndWaterBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int bottles = sc.nextInt();
            int capacity = sc.nextInt();
            int waterTank = sc.nextInt();
            if (waterTank >= bottles * capacity)
                System.out.println(bottles);
            else
                System.out.println(waterTank / capacity);
        }
        sc.close();
    }
}
