package code;

import java.util.Scanner;

public class MinimumPizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int friends = sc.nextInt();
            int slices = sc.nextInt();

            int totalSlices = friends * slices;

            if (totalSlices % 4 == 0)
                System.out.println(totalSlices / 4);
            else
                System.out.println((totalSlices / 4) + 1);

        }
        sc.close();
    }
}
