import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-->0) {
			String text = sc.nextLine();
			text = text.toLowerCase();
			char[] ch = text.toCharArray();
			// int ans = 0;

			// for (char c:ch) {
			// 	ans = ans + c;
			// }
			// if (ans == 337) System.out.println("YES");
			// else System.out.println("NO");

			if (ch[0] == 'y' || ch[0] == 'Y') {
				if (ch[1] == 'e' || ch[1] == 'E') {
					if (ch[2] == 's' || ch[2] == 'S') {
						System.out.println("YES");
					} else System.out.println("NO");
				} else System.out.println("NO");
			} else System.out.println("NO");
		}
	}
}