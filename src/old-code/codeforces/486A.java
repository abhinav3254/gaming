import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Long t = sc.nextLong();
		
		if (t%2==0) {
			t = t/2;
		} else {
			t = (t + 1)/2;
			t = t*-1;
		}
		
		System.out.println(t);
		
	}
}