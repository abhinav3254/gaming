import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		sc.nextLine();
		while (t-->0) {
			String s = sc.nextLine();

			int ans = 0;
			
			for (int i = 0; i < 6 && i < s.length(); i++) {
			    char c = s.charAt(i);

			    if (i < 3) {
			        if (Character.isDigit(c)) {
			            int a = Character.getNumericValue(c);
			            ans += a;
			        }
			    } else {
			        if (Character.isDigit(c)) {
			            int a = Character.getNumericValue(c);
			            ans -= a;
			        }
			    }
			}

			if (ans == 0) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}