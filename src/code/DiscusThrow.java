package code;

import java.util.Scanner;

public class DiscusThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int max = sc.nextInt();
            int b = sc.nextInt();
            if (max < b)
                max = b;
            int c = sc.nextInt();
            if (c > max)
                max = c;
            System.out.println(max);
        }
        sc.close();
    }
}
