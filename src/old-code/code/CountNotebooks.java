package code;

import java.util.Scanner;

public class CountNotebooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int totalPages = n * 1000;
            System.out.println(totalPages / 100);
        }
        sc.close();
    }
}
