package code;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            sc.nextLine();
            String n = sc.nextLine();
            String output = "";

            for (int i = n.length() - 1; i >= 0; i--) {
                output = output + n.charAt(i);
            }

            System.out.println(output);
        }
        sc.close();
    }
}
