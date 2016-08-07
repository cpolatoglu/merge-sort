import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void mergeArrayTest() {
		int[] firstArray = { 4, 5 };
		int[] secondArray = { 1, 8 };
		int[] expectedMergedArray = { 1, 4, 5, 8 };

		int[] actualMergedArray = MergeSort.merge(firstArray, secondArray);

		assertArrayEquals(expectedMergedArray, actualMergedArray);

	}

	@Test
	public void sortArrayTest() {
		int[] arrayToSort = { 5, 4, 7, 19, 13, 1, 2, 8, 9, 6, 12, 17, 39, 14 };
		int[] expectedSortedArray = { 1, 2, 4, 5, 6, 7, 8, 9, 12, 13, 14, 17, 19, 39 };

		int[] actualSortedArray = MergeSort.sort(arrayToSort);

		assertArrayEquals(expectedSortedArray, actualSortedArray);
	}

}