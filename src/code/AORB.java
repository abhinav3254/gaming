package code;

import java.util.Scanner;

public class AORB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(Math.max(solveOrderAToB(x, b), solveOrderBToA(x, b)));
            // System.out.println(solveOrderAToB(x, b));
            // System.out.println(solveOrderBToA(x, b));
        }
        sc.close();
    }

    private static int solveOrderAToB(int x, int b) {
        int aMarks = 500 - (x * 2);
        int bMarks = 1000 - ((x + b) * 4);
        return aMarks + bMarks;
    }

    private static int solveOrderBToA(int x, int b) {
        int aMarks = 1000 - (b * 4);
        int bMarks = 500 - ((x + b) * 2);
        return aMarks + bMarks;
    }
}
