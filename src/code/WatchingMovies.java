package code;

import java.util.Scanner;

public class WatchingMovies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x - (y / 2));
        sc.close();
    }
}