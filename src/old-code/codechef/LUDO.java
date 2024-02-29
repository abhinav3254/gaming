import java.io.*;

// LUDO
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-->0) {
			int s = Integer.parseInt(br.readLine());
			if (s == 6) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}