import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		sc.nextLine();

		while (t-->0) {
			String val = sc.nextLine();

			String codeforces = "codeforces";

			int ans = 0;
			for (int i = 0;i<val.length();i++) {
				if (codeforces.charAt(i) != val.charAt(i)) ans++;
			}

			System.out.println(ans);
		}

	}
}