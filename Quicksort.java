public class Quicksort {
	private int[] array;

	public static void main(String[] agrs) {

		Quicksort qs = new Quicksort();

		qs.start();

	}

	private void start() {
		int[] input = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12 };

		array = input;

		doQuickSort(0, input.length - 1);

		for (int i : array) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

	private void doQuickSort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;

		int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

		while (i <= j) {

			while (array[i] < pivot) {
				i++;
			}

			while (array[j] > pivot) {
				j--;
			}

			if (i <= j) {
				exchangeNumbers(i, j);
				i++;
				j--;
			}
		}

		if (lowerIndex < j) {
			doQuickSort(lowerIndex, j);
		}

		if (i < higherIndex) {
			doQuickSort(i, higherIndex);
		}
	}

	private void exchangeNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
