/*

Thought Procedure :- 

To calculate the number of ways to climb the stairs, we can observe that when we are on the nth stair,
we have two options:

either we climbed one stair from the (n-1)th stair or
we climbed two stairs from the (n-2)th stair.
By leveraging this observation, we can break down the problem into smaller subproblems and apply the concept of the Fibonacci series.
The base cases are when we are on the 1st stair (only one way to reach it) and the 2nd stair (two ways to reach it).
By summing up the number of ways to reach the (n-1)th and (n-2)th stairs, we can compute the total number of ways to climb the stairs. This allows us to solve the problem efficiently using various dynamic programming techniques such as recursion, memoization, tabulation, or space optimization.



*/

class Main {

	public static void main(String[] args) {
		System.out.println(climbStairs(3));
	}

	public static int climbStairs(int n) {
		if (n == 1 || n == 2) {
			return n;
		}

		int[] arr = new int[n+1];

		arr[1] = 1;
		arr[2] = 2;

		for (int i = 3;i<=n;i++) {

			arr[i] = arr[i-1] + arr[i-2];

		}

		return arr[n];
    }
}