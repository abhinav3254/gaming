import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0) {
			int k = sc.nextInt();
			int a = k;
			int b = 0;
			int count = 0;

			while (a>b) {
				a--;
				b++;
				count++;
			}
			System.out.println(count-1);
		}
	}
}