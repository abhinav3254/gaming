/**
 * Solution for Codeforces contests.
 * Author: abhinav3254
 * github :- https://github.com/abhinav3254
 */
 
 
import java.util.Scanner;
 
public class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int t = sc.nextInt();
		sc.nextLine();
		while (t-->0) {
			String sequence = sc.nextLine();
			String s = "";
 
			for (int i = 0;i<sequence.length();i++) {
				if (sequence.charAt(i) == 'B') {
			    // remove big letter from the rightmost from s
				    for (int j = s.length() - 1; j >= 0; j--) {
				        if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') {
				            // Remove the character at index j from string s
				            s = s.substring(0, j) + s.substring(j + 1);
				            break; // Exit the loop after removing the rightmost big letter
				        }
				    }
				} else if (sequence.charAt(i) == 'b') {
				    // remove small letter from the rightmost from s
				    for (int j = s.length() - 1; j >= 0; j--) {
				        if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') {
				            // Remove the character at index j from string s
				            s = s.substring(0, j) + s.substring(j + 1);
				            break; // Exit the loop after removing the rightmost small letter
				        }
				    }
				} else {
					s = s+sequence.charAt(i);
				}
			}
 
			System.out.println(s);
		}
	}
}