import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :- ");
		String ans = sc.nextLine();
		System.out.println("ans :- "+swapVowelsAtEnds(ans));

	}

	private static boolean isVowel(char ch) {
	    ch = Character.toLowerCase(ch);
	    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

	private static String swapVowelsAtEnds(String s) {
	    char[] charArray = s.toCharArray();
	    int start = 0;
	    int end = s.length() - 1;

	    while (start < end) {
	        if (isVowel(charArray[start]) && isVowel(charArray[end])) {
	            char temp = charArray[start];
	            charArray[start++] = charArray[end];
	            charArray[end--] = temp;
	        } else if (!isVowel(charArray[start])) {
	            start++;
	        } else if (!isVowel(charArray[end])) {
	            end--;
	        }
	    }
	    return new String(charArray);
	}

}