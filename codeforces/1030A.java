import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		int t = sc.nextInt();

		while (t-->0 ) {
			int a = sc.nextInt();

			if (a == 1) {
				flag = false;
				break;
			}
		}

		if (flag) System.out.println("EASY");
		else System.out.println("HARD");
	}
}