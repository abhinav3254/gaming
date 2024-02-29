import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-->0) {

			int h = sc.nextInt();
			int i = 1;
			int c = 0;

			while (h>0) {
				c++;
				if (isPrime(h)) {
					h = 0;
					break;
				} else {
					h = h-i;
					i = i*2;
				}

			}

			if (h == 0)
				System.out.println(c);
			else
				System.out.println(-1);

			
		}
	}

	public static boolean isPrime(int n) {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false ;
            }
            
        }
        return true;
    }
}