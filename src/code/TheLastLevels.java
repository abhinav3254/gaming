package code;

import java.util.Scanner;

public class TheLastLevels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int levels = sc.nextInt();
            int mins = sc.nextInt();
            int breakTime = sc.nextInt();

            if (levels <= 3)
                System.out.println(levels * mins);
            else if (levels % 3 == 0)
                System.out.println((levels * mins) + (((levels / 3) - 1) * breakTime));
            else
                System.out.println((levels * mins) + ((levels / 3) * breakTime));

        }
        sc.close();
    }
}
