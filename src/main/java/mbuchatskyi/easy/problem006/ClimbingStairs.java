package mbuchatskyi.easy.problem006;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 * 
 * @see https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStairs {
	public static int climbStairs(int n) {
		// n == n - 1 + n - 2
		// Fibonacci
		
		if (n < 2) {
			return 1;
		}
		
		int n1 = 1;
		int n2 = 2;
		
		for (int i = 2; i < n; i++) { 
			// n2 --> n1
			// n1 + n2 --> n2
			
			int currentN1 = n1; // 3
			
			n1 = n2; // 5
			n2 = currentN1 + n2; // 8
		}
		
		return n2;
	}
}
