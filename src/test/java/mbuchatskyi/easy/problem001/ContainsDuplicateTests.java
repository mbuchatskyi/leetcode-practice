package mbuchatskyi.easy.problem001;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ContainsDuplicateTests {
	
	@Test
	public void firstExample() {
		int[] input = new int[] {1, 2, 3, 1};
	
		assertTrue(ContainsDuplicate.containsDuplicate(input));
	}
	
	@Test
	public void secondExample() {
		int[] input = new int[] {1, 2, 3};
		
		assertFalse(ContainsDuplicate.containsDuplicate(input));
	}
	
	@Test
	public void thirdExample() {
		int[] input = new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
		
		assertTrue(ContainsDuplicate.containsDuplicate(input));
	}
}

