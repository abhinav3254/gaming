// import java.util.Scanner;

// class Main {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);

// 		int t = sc.nextInt();

// 		while (t-->0) {
// 			int a = sc.nextInt();
// 			int b = sc.nextInt();

// 			int c = sc.nextInt();
// 			int d = sc.nextInt();

// 			int m1 = 0;
// 			if (a>b) m1 = a;
// 			else m1 = b;

// 			int m2 = 0;
// 			if (c>d) m2 = c;
// 			else m2 = d;

// 			if (m1<d || m1<c) System.out.println("NO");
// 			//else if (m2<a || m2<b) System.out.println("NO");
// 			else System.out.println("YES");
			
// 		}
// 	}
// }

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = sc.nextInt();
            int d = sc.nextInt();

            int m1 = Math.max(a, b);
            int m2 = Math.max(c, d);
            int min1 = Math.min(a, b);
            int min2 = Math.min(c, d);

            if ((m1 < min2 || m2 < min1)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
