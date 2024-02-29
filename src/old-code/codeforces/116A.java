import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int exit = 0,entry = 0,max = 0;
		int temp = 0;

		int n = sc.nextInt();

		while (n-->0) {

			exit = sc.nextInt();
			entry = sc.nextInt();

			temp = (temp-exit)+entry;

			if (max<temp) max = temp;
		}

		System.out.println(max);

	}
}