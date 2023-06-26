package mbuchatskyi.easy.problem003;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n], return 
 * an array of all the integers in the range [1, n] that do not appear in nums.
 * 
 * @see https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 */
public class FindAllNumbersDisappearedInArray {
/*	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<>();
		
		for (int i = 1; i < nums.length + 1; i++) {
			result.add(i);
		}
		
		for (int i : nums) {
			if (result.contains(i)) {
				result.remove(Integer.valueOf(i));
			}
		}
		
		return result;
	}    <-- too slow   */ 
	
	public static List<Integer> findDisappearedNumbers(int[] nums){
		List<Integer> result = new ArrayList<>();
		
		int i = 0;
		while (i < nums.length) {
			int truePosition = nums[i] - 1; 
			
			if (nums[i] != nums[truePosition]) {
				int temp = nums[i];
				nums[i] = nums[truePosition];
				nums[truePosition] = temp;
			} else {i++;}
		} 

		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != j + 1)
				result.add(j+1);
		}

		return result;
	}
}
