import java.util.Scanner;
import java.util.HashSet;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(isHappy(2));

	}

	private static boolean isHappy(int n) {
		HashSet<Integer> set = new HashSet<>();

		while (n!=1 && !set.contains(n)) {
			set.add(n);
			n = square(n);
		}

		return n == 1;

	}

	private static int square(int num) {
		int ans = 0;

		while (num >0) {
			int rem = num%10;
			ans += rem*rem;
			num /= 10; 
		}

		return ans;

	}
}