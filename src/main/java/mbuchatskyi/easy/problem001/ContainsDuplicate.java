package mbuchatskyi.easy.problem001;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * 
 * @see https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		
		for (int number : nums) {
			if (set.contains(number)) {
				return true;
			}
			
			set.add(number);
		}
	
		return false;
	}
}
