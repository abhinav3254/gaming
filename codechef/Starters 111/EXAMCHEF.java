import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-->0) {

			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			x = x*y;
			double ans = (double)z/(double)x;
			ans = ans * 100;
			
			if (ans>50) {
			    System.out.println("YES");
			} else {
			    System.out.println("NO");
			}
			
		}

		sc.close();
	}
}