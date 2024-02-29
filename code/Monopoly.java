package code;

import java.util.Scanner;

public class Monopoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            // see in case making it normalize we can use array
            if (a > b + c + d || b > a + c + d || c > a + b + d || d > a + b + c)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        sc.close();
    }
}
