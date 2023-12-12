import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("sum of "+n+" natural numbers are :- "+findSumOfNNaturalNumber(n));
	}

	private static int findSumOfNNaturalNumber(int n) {
		if (n == 0) return 0;
		return n + findSumOfNNaturalNumber(n-1);
	}
}