import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0) {
			int k = sc.nextInt();
			if (k%2 == 0) { k = k-1;}
			System.out.println(k/2);
		}
	}
}