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

		boolean isFromFirstArray = true;
		for (int i = 0, j = 0, k = 0; i < totalLength; i++) {
			if (j >= firstArray.length) {
				isFromFirstArray = false;
			} else if (k >= secondArray.length) {
				isFromFirstArray = true;
			} else if (firstArray[j] < secondArray[k]) {
				isFromFirstArray = true;
			} else if (firstArray[j] >= secondArray[k]) {
				isFromFirstArray = false;
			}

			if (isFromFirstArray) {
				mergedArray[i] = firstArray[j];
				j++;
			} else {
				mergedArray[i] = secondArray[k];
				k++;
			}
		}

		return mergedArray;
	}
}
