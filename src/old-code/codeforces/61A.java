import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		String ans = "";
		
		for (int i = 0;i<num1.length();i++) {
			int a = num1.charAt(i);
			int b = num2.charAt(i);
			
			if (a == b) {
				ans = ans+"0";
			} else {
				ans = ans+"1";
			}
		}
		
		System.out.println(ans);
	}
}