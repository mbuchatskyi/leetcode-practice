package mbuchatskyi.easy.problem004;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * Given a non-empty array of integers nums, every element appears twice except
 * for one. Find that single one.
 * 
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 * 
 * @see https://leetcode.com/problems/single-number/
 */
public class SingleNumber {
	public static int singleNumber(int[] nums) {
		return Arrays.stream(nums)
				.boxed()
				.collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue() == 1)
				.findFirst()
				.map(Map.Entry::getKey)
				.orElseThrow(NoSuchElementException::new);
	}
}
