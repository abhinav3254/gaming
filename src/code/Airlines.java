package code;

import java.util.Scanner;

public class Airlines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int aircraft = sc.nextInt();
            int pass = sc.nextInt();
            aircraft *= 100;
            if (pass <= aircraft)
                System.out.println(0);
            else {
                pass -= aircraft;
                if (pass < 0)
                    pass *= -1;
                if (pass % 100 == 0)
                    System.out.println(pass / 100);
                else
                    System.out.println((pass / 100) + 1);
            }
        }
        sc.close();
    }
}