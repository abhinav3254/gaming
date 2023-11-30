import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int c = 0;

		while (x>0) {
			if (x>=5) {
				x = x-5;
				c++;
			} else if (x>=4) {
				x = x-4;
				c++;
			} else if (x>=3) {
				x = x-3;
				c++;
			} else if (x>=2) {
				x = x-2;
				c++;
			} else if (x>=1) {
				x = x-1;
				c++;
			}
		}

		System.out.println(c);
	}
}