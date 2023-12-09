import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string:- ");
		String str = sc.nextLine();
		System.out.println("ans :- "+checkRecord(str));
		sc.close();
	}

	public static boolean checkRecord(String s) {
        int absentCount = 0;
        int lateCount = 0;

        for (char c : s.toCharArray()) {
            if (c == 'A') {
                absentCount++;
                // Reset late count when absent
                lateCount = 0;
            } else if (c == 'L') {
                lateCount++;
                if (lateCount > 2) {
                    return false;
                }
            } else {
                // Reset late count when P
                lateCount = 0; 
            }
        }

        return absentCount <= 1;
    }
}