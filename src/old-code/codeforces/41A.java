import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		String a = sc.nextLine();
		String b = sc.nextLine();

		int k = b.length();

		if (a.length() != b.length()) {
			System.out.println("NO");
			return;
		}
		else {
			for (int i = 0;i<a.length();i++) {
				int num1 = a.charAt(i);
				int num2 = b.charAt(--k);

				if (num1 != num2) {
					flag = false;
				}
			}
		}

		if (flag) System.out.println("YES");
		else System.out.println("NO");

	}
}