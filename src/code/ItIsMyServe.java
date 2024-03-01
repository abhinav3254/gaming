package code;

import java.util.Scanner;

public class ItIsMyServe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            a += b;
            a %= 4;
            if (a < 2)
                System.out.println("Alice");
            else
                System.out.println("Bob");
        }
        sc.close();
    }
}
