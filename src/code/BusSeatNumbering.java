package code;

import java.util.Scanner;

public class BusSeatNumbering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n > 15) {
                if (n > 25)
                    System.out.println("Upper Single");
                else
                    System.out.println("Upper Double");
            } else {
                if (n < 11)
                    System.out.println("Lower Double");
                else
                    System.out.println("Lower Single");
            }
        }
        sc.close();
    }
}