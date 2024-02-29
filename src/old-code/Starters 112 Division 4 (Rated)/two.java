import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-->0) {

			int bill = sc.nextInt();
			int friends = sc.nextInt();

			int share = bill/(friends+1);

			System.out.println(bill-share*friends);
		}
	}
}