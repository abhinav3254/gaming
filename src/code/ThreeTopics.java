package code;

import java.util.Scanner;

public class ThreeTopics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = sc.nextInt();
        if (a == x || b == x || c == x)
            System.out.println("yes");
        else
            System.out.println("no");
        sc.close();
    }
}
