package code;

import java.util.Scanner;

public class SelfDefenceTraining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x > 9 && x < 61)
                    count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
