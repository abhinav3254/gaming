package code;

import java.util.Scanner;

public class MarioAndTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            // given normal intially
            x += 1;
            x %= 3;

            switch (x) {
                case 0:
                    System.out.println("SMALL");
                    break;
                case 1:
                    System.out.println("normal");
                    break;
                default:
                    System.out.println("huge");
                    break;
            }
        }
        sc.close();
    }
}
