package code;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int time = sc.nextInt();
            if (time + 3 <= 10)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        sc.close();
    }
}
