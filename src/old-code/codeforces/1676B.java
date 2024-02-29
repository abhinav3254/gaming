import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-->0) {
			int n = sc.nextInt();

			int[] arr = new int[n];
			int min = Integer.MAX_VALUE;
			for (int i = 0;i<n;i++) {
				arr[i] = sc.nextInt();
				if (min>arr[i]) min = arr[i];
			}
			int ans = 0;
			for (int i = 0;i<n;i++) {
				ans = ans + (arr[i]-min);
			}

			System.out.println(ans);
		}
	}
}