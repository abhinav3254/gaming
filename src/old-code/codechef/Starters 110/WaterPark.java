import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();

		int h = sc.nextInt();

		if (w>=60 && h<=130) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}