package code;

import java.math.BigInteger;
import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            BigInteger product = BigInteger.ONE;
            while (n > 1) {
                product = product.multiply(BigInteger.valueOf(n));
                n -= 1;
            }

            System.out.println(product);
        }
        sc.close();
    }
}
