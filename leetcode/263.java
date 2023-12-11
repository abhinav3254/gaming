import java.util.Scanner;
import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(isUglyOptimized(n));

	}

	

	public static boolean isUgly(int n) {
		List<Integer> list = getAllPrime(n);
		for(int a:list) {
        		System.out.print(a+" ");
        	}
    	System.out.println();
		if (list.size()>3) return false;
		else {
			for(int a:list) {
        		if (a == 2 ) continue;
        		if (a == 3 ) continue;
        		if (a == 5 ) continue;
        		if (a == 5 ) return false;
        	}
        	return true;
		}
        
    }

    // getting range of all the prime numbers in between of the number
    private static List<Integer> getAllPrime(int n) {
    	List<Integer> list = new LinkedList<>();
    	for (int k = 2;k<=n;k++) {
    	int count  = 0;
	    	for (int i = 1;i<=k;i++) {
	    		if (k%i == 0) count++; 
	    	}
    		// if number is only divisible by 1 and number itself then
    		// only count will increment so in case of prime number number
    		// is only divisble by 1 and itself so applying that logic here
	    	if (count==2) list.add(k);
	    	count = 0;
    	}

    	return list;
    }
}