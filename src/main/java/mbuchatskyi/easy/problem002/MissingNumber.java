package mbuchatskyi.easy.problem002;

import java.util.Arrays;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return
 * the only number in the range that is missing from the array.
 * 
 * @see https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {
	public static int missingNumber(int[] nums) {
		int n = nums.length; 
	
		// sum of an arithmetic progression = (a1 + an)*n / 2
		// where a1 = 0, an = n+1;
		
		// (0 + n+1)*n / 2
		
		return ((n+1) * n) / 2 - Arrays.stream(nums).sum();
	}
}
