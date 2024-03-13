package starters_125;

import java.util.Scanner;

public class CCOV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        if (speed > 40)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}