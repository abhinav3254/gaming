package code;

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int flag = -1;

            for (int i = 1; i <= n; i++) {
                int product = i * x;
                if (product == y || y == 0) {
                    flag = 0;
                    break;
                }

                if (product > y)
                    break;
            }
            if (flag == 0)
                System.out.println("yes");
            else if (flag == -1)
                System.out.println("no");

        }
        sc.close();
    }
}
