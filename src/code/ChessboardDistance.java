package code;

import java.util.Scanner;

public class ChessboardDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            x1 -= x2;
            y1 -= y2;
            if (x1 < 0)
                x1 *= -1;
            if (y1 < 0)
                y1 *= -1;
            if (x1 > y1)
                System.out.println(x1);
            else
                System.out.println(y1);
        }
        sc.close();
    }
}
