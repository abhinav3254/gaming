import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String year = sc.nextLine();

		while (true) {
			year = (Integer.parseInt(year)+1)+"";
			if (isAns(year)) {
				System.out.println(year);
				break;
		}
	}
}

	private static boolean isAns(String year) {
		for (int i = 0;i<year.length();i++) {
			for (int j = i+1;j<year.length();j++) {
				int a = year.charAt(i);
				int b = year.charAt(j);

				if (a == b) {
					return false;
				}
			}
		}
		return true;
	}
}