package starters_125;

import java.util.Scanner;

public class FKMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int MAX = 0;
            int count = 0;
            int len = -1;
            int ptr = -1;
            int final_start = -1;
            int final_end = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    count++;
                    ptr = i;
                } else if (arr[i] == 1) {
                    if (MAX < count) {
                        if (i - ptr >= len) {
                            final_end = i;
                            final_start = ptr - 1;
                            MAX = count;
                            ptr = -1;
                        }
                    }
                    count = 0;
                }
            }
            if (MAX == 0)
                MAX = count;

            System.out.println(MAX);
            System.out.println("starting index = " + final_start + " and end is :- " + final_end);
        }
        sc.close();
    }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int t = sc.nextInt();
    // while (t-- > 0) {
    // int n = sc.nextInt();
    // sc.nextLine();
    // String string = sc.nextLine();

    // int start_index = -1;
    // int end_index = -1;
    // for (int i = 0; i < n; i++) {
    // if (string.charAt(i) == '0') {
    // start_index = i;
    // }
    // if (string.charAt(i) == '1') {
    // end_index = i;
    // }
    // }

    // if (end_index == -1)
    // end_index = n;

    // if (start_index == -1)
    // start_index = 0;

    // System.out.println(start_index + " : start index " + end_index + " : end
    // index");

    // }
    // sc.close();
    // }
}
