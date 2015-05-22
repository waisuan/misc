//http://codercareer.blogspot.co.uk/2011/10/no-16-maximum-length-of-incremental.html
public class MaxLengthOfIncrementalSubsequences {
	public static void main(String[] args) {
		System.out.println(maxLength(new int[] { 7, 2, 3, 1, 5, 8, 9, 6 }, 8));
	}

	private static int maxLength(int[] data, int length) {
		if (length < 0)
			return 0;

		int[] longest = new int[length];
		longest[0] = 1;

		int max = 0;

		for (int i = 1; i < length; i++) {
			max = 0;
			for (int j = 0; j < i; j++) {
				if (data[j] < data[i] && longest[j] > max) {
					max = longest[j];
				}
			}

			longest[i] = max + 1;
		}

		max = 0;
		for (int i = 0; i < length; i++) {
			if (longest[i] > max) {
				max = longest[i];
			}
		}

		return max;
	}
}
