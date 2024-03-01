package code;

import java.util.Scanner;

public class BathInWinters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            y *= 2;
            System.out.println(x / y);
        }
        sc.close();
    }
}
