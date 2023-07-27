package mbuchatskyi.easy.problem005;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TwoSumTests {

	@Test
	public void firstExample() {
		int[] input = {2, 7, 11, 9};
		int target = 9;
		
		int[] expected = {0, 1};
		
		assertEquals(expected[0], TwoSum.twoSum(input, target)[0]);
		assertEquals(expected[1], TwoSum.twoSum(input, target)[1]);
	}
	
	@Test
	public void secondExample() {
		int[] input = {3, 2, 4};
		int target = 6;
		
		int[] expected = {1, 2};
		
		assertEquals(expected[0], TwoSum.twoSum(input, target)[0]);
		assertEquals(expected[1], TwoSum.twoSum(input, target)[1]);
	}
	
	@Test
	public void thirdExample() {
		int[] input = {3, 3};
		int target = 6;
		
		int[] expected = {0, 1};
		
		assertEquals(expected[0], TwoSum.twoSum(input, target)[0]);
		assertEquals(expected[1], TwoSum.twoSum(input, target)[1]);
	}
}
