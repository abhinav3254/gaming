package code;

import java.util.Scanner;

public class FindingShoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int friends = sc.nextInt();
            int leftShoes = sc.nextInt();
            if (leftShoes >= friends)
                leftShoes = friends;
            System.out.println(friends * 2 - leftShoes);
        }
        sc.close();
    }
}
