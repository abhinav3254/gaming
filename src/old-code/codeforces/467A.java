import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int ans = 0;

		while (n-->0) {
			int pi = sc.nextInt();
			int qi = sc.nextInt();

			int check = pi-qi;

			if (check<0) check = check*-1;

			if (check>=2) ans++;
		}
		System.out.println(ans);
	}
}