import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-->0) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			int a1 = a,b1 = b;

			int c = 0;

			if (a>=b) {
				while (a%b != 0 && a1%b1 != 0) {
					c++;
					a++;
					a1--;
					b--;
					b1++;
				}
			} else {
				while (a1 % b1 != 0) {
                    c++;
                    a1++;
                    b1--;
                }
			}

			System.out.println(c);

		}
	}
}