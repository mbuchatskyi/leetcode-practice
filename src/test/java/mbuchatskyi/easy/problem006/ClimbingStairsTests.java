package mbuchatskyi.easy.problem006;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClimbingStairsTests {
	@Test
	public void secondExample() {
		int input = 2;
	
		assertEquals(2, ClimbingStairs.climbStairs(input));
	}
	
	@Test
	public void thirdExample() {
		int input = 3;
		
		assertEquals(3, ClimbingStairs.climbStairs(input));
	}
}
