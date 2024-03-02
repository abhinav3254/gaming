package code;

import java.util.Scanner;

public class ChefEren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (n == 1)
                System.out.println(b);
            else if (n % 2 == 0)
                System.out.println(n / 2 * (a + b));
            else
                System.out.println(((n - 1) / 2 * (a + b)) + b);
        }
        sc.close();
    }
}
