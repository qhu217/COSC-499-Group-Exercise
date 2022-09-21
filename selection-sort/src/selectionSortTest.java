import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class selectionSortTest {

	@Test
	void test() {
		selectionSort ss = new selectionSort();
		int[] arr = {62,48,10,25,19};
		assertArrayEquals(new int[] {10,19,25,48,62}, selectionSort.selectionSort(arr));
	}

}
