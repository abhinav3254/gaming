import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println(addDigitsOptimize(num));

	}

	public static int addDigits(int num) {
        if (num<10) return num;
        else {
        	while (num>10) {
        		num = helper(num);
        	}
        }
        return num;
    }

    public static int helper(int num) {
    	int ans = 0;

    	while (num>0) {
    		int rem = num%10;
    		ans += rem;
    		num /= 10;
    	}
    	return ans;
    }

    // using digital root formula complexity --> O(1)
    public static int addDigitsOptimize(int num) {
	    if (num == 0) return 0;
	    return 1 + (num - 1) % 9;
	}

}