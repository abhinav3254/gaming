import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(nthUglyNumber(n));
	}

	public static int nthUglyNumber(int n) {
		int count = 1; 
		int i = 1;
        while (count < n) {
        	i++;
        	if (isUglyOptimized(i)) {
        		count++;
        	}
        }
        return i;
    }
	

	public static boolean isUglyOptimized(int n) {
		if (n <= 0) return false;

		while (n%2 == 0) n /= 2;
		while (n%3 == 0) n /= 3;
		while (n%5 == 0) n /= 5;

		return n == 1;

	}
}