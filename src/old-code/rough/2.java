import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.nextLine();
		//System.out.println(isPalindrome(s,0,s.length()-1));

		int base = sc.nextInt();
		int power = sc.nextInt();

		System.out.println(base+"^"+power+" = "+toThePower(base,power));
	}

	private static boolean isPalindrome(String s,int l,int r) {
		if (l>=r) return true;
		if (s.charAt(l) == s.charAt(r))
			return isPalindrome(s,++l,--r);
		else return false;
	}

	private static int toThePower(int base,int power) {
		if (power == 1) return base;
		return base*toThePower(base,--power);
	}
}