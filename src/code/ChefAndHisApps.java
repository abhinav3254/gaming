package code;

import java.util.Scanner;

public class ChefAndHisApps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int z = sc.nextInt();
            if ((n - (a + b)) >= z)
                System.out.println(0);
            else if ((a + z) <= n || (b + z) <= n)
                System.out.println(1);
            else
                System.out.println(2);
        }
        sc.close();
    }
}
