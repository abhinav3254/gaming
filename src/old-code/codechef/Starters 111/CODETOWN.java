import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-->0) {
			String s = sc.nextLine();

			if (checkPattern(s)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
		sc.close();
	}

	public static boolean checkPattern(String str) { 
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive check
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                if ((i == 1 || i == 3 || i == 5) && isVowel(ch)) {
                    continue; // Vowels are allowed at 1st, 3rd, and 5th positions
                } else if ((i != 1 && i != 3 && i != 5) && !isVowel(ch)) {
                    continue; // Consonants are allowed at other positions
                } else {
                    return false; // If conditions are not met, return false
                }
            } else {
                return false; // If non-letter characters are found, return false
            }
        }
        return true; // All conditions met, return true
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}