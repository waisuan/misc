package progground;

public class MaxSubArrayProb {
	public static void main(String[] args) {
		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int maxSum = 0;
		int maxEndingHere = 0;

		for (int i = 0; i < arr.length; i++) {
			maxEndingHere = maxEndingHere + arr[i];

			if (maxEndingHere < 0) {
				maxEndingHere = 0;
			}

			if (maxEndingHere > maxSum) {
				maxSum = maxEndingHere;
			}
		}

		System.out.println(maxSum);
	}
}
