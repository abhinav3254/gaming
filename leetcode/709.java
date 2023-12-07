/**
 *  A - > 65
 *  Z - > 90
 * 
 * logic that I am going to implement - > (input-65)+97
 * 
 */

import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :- ");
		String str = sc.nextLine();
		sc.close();

		System.out.println(toLowerCase(str));
	}

	public static String toLowerCase(String s) {
	    StringBuilder ans = new StringBuilder();
	    // for (int i = 0; i < s.length(); i++) {
	    //     char input = s.charAt(i);
	    //     if (input >= 'A' && input <= 'Z') {  
	    //         input = (char) (input + 32); 
	    //     } 
	    //     ans.append(input);
	    // }

      // faster 
      // beacuse we are not using any charAt()
      for(char c : s.toCharArray()){
        if (c >= 'A' && c <= 'Z' ){
            c = (char) ((int) c + 32 );
        }
        ans.append(c);
      }
	    return ans.toString();
	}

}