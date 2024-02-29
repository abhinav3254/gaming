package code;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int friends = sc.nextInt();
            int cost = sc.nextInt();

            int sub = friends / 6;

            int remaningFriends = friends % 6;

            if (remaningFriends > 0)
                sub = sub + 1;

            System.out.println(cost * sub);

        }

        sc.close();

    }
}
