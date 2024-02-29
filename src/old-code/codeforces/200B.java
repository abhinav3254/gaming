import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int t = sc.nextInt();
		int t_copy = t;
		while (t-->0) {
			int n = sc.nextInt();
			
			sum = sum + n;
		}
		
		double ans = (double)sum/(double) t_copy;
		
		System.out.println(ans);
		
		sc.close();
	}
}