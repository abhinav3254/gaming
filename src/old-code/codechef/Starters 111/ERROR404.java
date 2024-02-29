import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		if (x == 404) System.out.println("NOT FOUND");
		else System.out.println("FOUND");

		sc.close();
	}
}