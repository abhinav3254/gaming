import java.util.Scanner;

class Main {

	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-->0) {

            int x = sc.nextInt();

            int n = sc.nextInt();

            int ans = 0;

            if (n%100 != 0) {
                n = (n-n%100)+100;
            }

            int temp = n / 100;

            if (temp>x) {
                System.out.println(temp-x);
            } else {
                System.out.println(0);
            }

        }
    }
}