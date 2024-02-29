package code;

import java.util.Scanner;

public class ChefAndNextGen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int x = sc.nextInt();
            int y = sc.nextInt();

            int unitsNeeded = a * b;
            int unitsCanBeProduced = x * y;
            if (unitsNeeded <= unitsCanBeProduced)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        sc.close();
    }
}
