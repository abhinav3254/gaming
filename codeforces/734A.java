import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String rounds = sc.nextLine();

		int A = 'A';
		int B = 'D';

		int a = 0,b = 0;

		for(int i = 0;i<n;i++) {
			int val = rounds.charAt(i);

			if (val == A) {
				a++;
			} else b++;
		}

		if (a>b) System.out.println("Anton");
		else if(b>a) System.out.println("Danik");
		else if (a==b) System.out.println("Friendship");
	}
}