package code;

import java.util.Scanner;

public class Reverse {

    /**
     * In this code the issue is that it will fail on the test case of
     * 1234500 and the output will be 0054321
     * that we don't want to ignore this code
     * 
     * @param args
     */
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int t = sc.nextInt();
    // while (t-- > 0) {
    // sc.nextLine();
    // String n = sc.nextLine();
    // String output = "";

    // for (int i = n.length() - 1; i >= 0; i--) {
    // output = output + n.charAt(i);
    // }

    // System.out.println(output);
    // }
    // sc.close();
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int rem = 0;
            int n = sc.nextInt();
            while (n > 0) {
                rem = (rem * 10) + (n % 10);
                n /= 10;
            }

            System.out.println(rem);
        }
        sc.close();
    }
}
