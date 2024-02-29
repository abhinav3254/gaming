package code;

import java.util.Scanner;

public class MaximiseTheTastiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int max_1 = sc.nextInt();
            int b = sc.nextInt();
            if (max_1 < b)
                max_1 = b;
            int max_2 = sc.nextInt();
            int d = sc.nextInt();
            if (max_2 < d)
                max_2 = d;
            System.out.println(max_1 + max_2);
        }
        sc.close();
    }
}
