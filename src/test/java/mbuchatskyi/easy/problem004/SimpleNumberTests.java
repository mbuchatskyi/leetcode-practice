package mbuchatskyi.easy.problem004;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SimpleNumberTests {

	@Test
	public void firstExample() {
		int[] input = {2, 2, 1};
		
		assertEquals(1, SingleNumber.singleNumber(input));
	}
	
	@Test
	public void secondExample() {
		int[] input = {4, 1, 2, 1, 2};
		
		assertEquals(4, SingleNumber.singleNumber(input));
	}
	
	@Test
	public void thirdExample() {
		int[] input = {1};
		
		assertEquals(1, SingleNumber.singleNumber(input));
	}
}
