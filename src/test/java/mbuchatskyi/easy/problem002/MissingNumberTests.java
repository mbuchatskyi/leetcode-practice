package mbuchatskyi.easy.problem002;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MissingNumberTests {

	@Test
	public void firstExample() {
		int[] input = new int[] {3, 0, 1};
		
		assertEquals(2, MissingNumber.missingNumber(input));
	}
	
	@Test
	public void secondExample() {
		int[] input = new int[] {0, 1};
		
		assertEquals(2, MissingNumber.missingNumber(input));
	}
	
	@Test
	public void thirdExample() {
		int[] input = new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1};
		
		assertEquals(8, MissingNumber.missingNumber(input));
	}
	
}
