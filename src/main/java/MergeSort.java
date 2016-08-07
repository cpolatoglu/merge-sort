import java.util.Arrays;

public class MergeSort {

	public int[] sort(int[] arrayToSort) {

		int lengthOfArray = arrayToSort.length;
		if (lengthOfArray > 1) {
			int halfOfArray = lengthOfArray / 2;
			int[] firstHalf = Arrays.copyOfRange(arrayToSort, 0, halfOfArray);
			firstHalf = sort(firstHalf);

			int[] secondHalf = Arrays.copyOfRange(arrayToSort, halfOfArray, lengthOfArray);
			secondHalf = sort(secondHalf);

			arrayToSort = merge(firstHalf, secondHalf);
		}
		return arrayToSort;
	}

	public int[] merge(int[] firstArray, int[] secondArray) {

		int totalLength = firstArray.length + secondArray.length;
		int[] mergedArray = new int[totalLength];

		int i = 0, j = 0;

		while (i < firstArray.length && j < secondArray.length) {
			if (firstArray[i] < secondArray[j]) {
				mergedArray[i + j] = firstArray[i];
				i++;
			} else {
				mergedArray[i + j] = secondArray[j];
				j++;
			}
		}

		for (; i < firstArray.length; i++) {
			mergedArray[i + j] = firstArray[i];
		}

		for (; j < secondArray.length; j++) {
			mergedArray[i + j] = secondArray[j];
		}
		return mergedArray;
	}
}
