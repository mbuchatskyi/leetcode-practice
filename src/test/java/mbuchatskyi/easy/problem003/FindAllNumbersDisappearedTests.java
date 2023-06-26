package mbuchatskyi.easy.problem003;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FindAllNumbersDisappearedTests {
	@Test
	public void firstExample() {
		int[] input = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };

		List<Integer> expected = new ArrayList<>();
		expected.add(5);
		expected.add(6);

		assertEquals(expected, FindAllNumbersDisappearedInArray.findDisappearedNumbers(input));
	}

	@Test
	public void secondExample() {
		int[] input = new int[] {1, 1};

		List<Integer> expected = new ArrayList<>();
		expected.add(2);

		assertEquals(expected, FindAllNumbersDisappearedInArray.findDisappearedNumbers(input));
	}
}
