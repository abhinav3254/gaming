package code;

import java.util.Scanner;

public class DecrementORIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 4 == 0)
            System.out.println(++n);
        else
            System.out.println(--n);
        sc.close();
    }
}
