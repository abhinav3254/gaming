package starters_125;

import java.util.Scanner;

/**
 * 
 * My mistake was that I was hardcoding 2 as fixed but not,
 * we have to calculate total days I misunderstood the question
 */
public class FKMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            int finalCountZero = 0;
            int countZero = 0;

            int countOne = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1')
                    countOne++;
            }

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == '0') {
                    countZero++;
                } else {
                    finalCountZero = Math.max(finalCountZero, countZero);
                    countZero = 0;
                }
            }
            finalCountZero = Math.max(finalCountZero, countZero);

            System.out.println(countOne + finalCountZero);

        }

        sc.close();
    }
}