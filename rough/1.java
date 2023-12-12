import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("sum of "+n+" natural numbers are :- "+findSumOfNNaturalNumber(n));
		System.out.println("factorial of "+n+" is :- "+factorialOfNumber(n));
		System.out.println("fib of "+n+"th index is :- "+fib(n));
	}


	/**
	 * formula for sum of n natural number is :- n(n+1)/2
	 * 
	 * @author AbKumar
	 * 
	 * What is the common approach I've used here is that
	 * always think of just small number like find the sum of first
	 * 2 natural number , same for factorial of 2 only 
	 * and in Fibonacci same thought to find the fibonacci of just 2
	 */
	private static int findSumOfNNaturalNumber(int n) {
		if (n == 0) return 0;
		return n + findSumOfNNaturalNumber(n-1);
	}

	private static int factorialOfNumber (int n) {
		if (n<=1) return 1;
		return n*factorialOfNumber(n-1);
	}

	private static int fib(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		return fib(n-1) + fib(n-2); 
	}

}