import java.util.Scanner;


class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(convertToTitle(701));

		sc.close();
	}

	public static String convertToTitle(int n) {
        String ans = "";

        while (n>0) {
        	n--;
        	char temp = (char)((n%26)+65);
        	ans = temp+ans;
        	n = n/26;
        }
        return ans;
    }
}