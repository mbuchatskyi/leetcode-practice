package mbuchatskyi.easy.problem005;

import java.util.*;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * @see https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> seen = new HashMap<>();
		int[] result = new int[2];
		
		for (int i = 0; i < nums.length; i++) {
			if (seen.containsKey(target - nums[i])) {
				result[0] = seen.get(target - nums[i]);
				result[1] = i;
			}
			
			seen.put(nums[i], i);
		}
		
		return result;
	}
}
