import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("sum of "+n+" natural numbers are :- "+findSumOfNNaturalNumber(n));
		System.out.println("factorial of "+n+" is :- "+factorialOfNumber(n));
	}


	/**
	 * formula for sum of n natural number is :- n(n+1)/2
	 * 
	 * @author AbKumar
	 */
	private static int findSumOfNNaturalNumber(int n) {
		if (n == 0) return 0;
		return n + findSumOfNNaturalNumber(n-1);
	}

	private static int factorialOfNumber (int n) {
		if (n<=1) return 1;
		return n*factorialOfNumber(n-1);
	}

}