package code;

import java.util.Scanner;

public class Weights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int w = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if (w == x || w == y || w == z)
                System.out.println("yes");
            else if (w == (x + y) || w == (y + z) || w == (x + z))
                System.out.println("yes");
            else if (w == (x + y + z))
                System.out.println("yes");
            else
                System.out.println("no");
        }
        sc.close();
    }
}
