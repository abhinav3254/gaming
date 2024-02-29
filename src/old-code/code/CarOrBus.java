package code;

import java.util.Scanner;

public class CarOrBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int bike = sc.nextInt();
            int car = sc.nextInt();
            if (car > bike)
                System.out.println("BIKE");
            else if (car < bike)
                System.out.println("CAR");
            else
                System.out.println("SAME");
        }
        sc.close();
    }
}
