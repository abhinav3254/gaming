package code;

import java.util.Scanner;

public class CandyDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int rem = n % m;
            n /= m;
            if (rem == 0 && n % 2 == 0)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        sc.close();
    }
}
