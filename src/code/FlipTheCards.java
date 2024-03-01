package code;

import java.util.Scanner;

public class FlipTheCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int min = n - x;
            if (min > x)
                min = x;
            System.out.println(min);
        }
        sc.close();
    }
}
