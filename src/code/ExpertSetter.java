package code;

import java.util.Scanner;

public class ExpertSetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            double percent = (y / x) * 100;

            if (percent >= 50)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
