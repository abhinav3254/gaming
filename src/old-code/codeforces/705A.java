import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String message = "I hate it";
		for (int i = 2;i<=t;i++) {
			message = message.substring(0,message.length()-2)+"that ";
			if (i%2==0) {
				message = message+"I love it";
			} else {
				message = message + "I hate it";
			}
		}
		
		System.out.println(message);
	}
}