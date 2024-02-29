import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-->0) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			x = x * 3;

			if (y>=x) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}