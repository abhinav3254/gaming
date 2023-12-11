import java.util.Scanner;
import java.util.HashSet;

// floydsTortoise algo used

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(floydsTortoise(19));

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

	private static boolean floydsTortoise (int n) {
		int slow = n;
		int fast = n;

		do {
			slow = square(slow);
			fast = square(square(fast));
		} while(slow != fast && slow != 1);

		return slow == 1;
	}
}