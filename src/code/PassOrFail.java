package code;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int correct = sc.nextInt();
            int pass = sc.nextInt();
            n -= correct;
            correct = (correct * 3) - n;
            if (correct >= pass)
                System.out.println("pass");
            else
                System.out.println("fail");
        }
        sc.close();
    }
}
