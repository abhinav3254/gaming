import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(canWinNim(n));
	}
	// optimal solution
	public boolean canWinNim(int n) {

        /*
            1 win, 2 win, 3 win, 4 lose.
            5 win because I can take 1 and there 4 stones left, 
            which is loosing condition.
            6 win, since I can take 2.
            7 win, since I can take 3.
            8 lose, since I can't make it left 4 stones, 
            since my max move is removing only 3 stones.
            The rest can be proven by induction.
         */

         /**
         Note 1 thing don't think more than 4
         1 -> I can win
         2 -> I can win
         3 -> I can win
         4 -> He will win

         so from above observation if any number which is divisble by 4 
         I can't win bcz if from 4 i can max remove 3 and he can win 
         same if I pick 2 he will win
         same if I pick 1 he will win
          */

          return (n%4 != 0);
        
    }

	public static boolean canWinNim(int n) {
		if (n<=3) return true;
		int count = 0;
		

		while (n>3) {
			n = n-3;
			count++;
		}
		count += 1;
		if (count%2 == 0) return false;
		else return true;
    }
}