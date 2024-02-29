import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int h = sc.nextInt();

		int ans = 0;

		while (n-->0) {

			int p = sc.nextInt();

			if (p>h) ans = ans + 2;
			else ans++;
		}

		System.out.println(ans);
	}
}