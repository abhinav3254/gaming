import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("a:- ");
		int a = sc.nextInt();
		System.out.println("b:- ");
		int b = sc.nextInt();
		*/
		System.out.println("gcd of :- "+gcdIterative(15,10));
		System.out.println("gcd of :- "+gcdRecursive(15,10));
	}
	
	private static int gcdIterative(int a,int b) {
		
		while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
		
	}
	
	private static int gcdRecursive(int a,int b) {
		
		if (b == 0) return a;
		
		int temp = b;
		b = a%b;
		a = temp;
		
		return gcdRecursive(a,b);
	}
}