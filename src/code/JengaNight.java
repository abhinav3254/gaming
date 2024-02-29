package code;

import java.util.Scanner;

public class JengaNight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            if (x >= n && x % n == 0)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        sc.close();
    }
}
