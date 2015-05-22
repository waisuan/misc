package progground;

import java.util.HashMap;

public class UniqueChar {
	public static void main(String[] args) {
		/*
		 * Implement an algorithm to determine if a string has all unique
		 * characters. What if you can not use additional data structures?
		 */

		String testString = "uniqae";

		HashMap<String, Integer> mapOfChars = new HashMap<String, Integer>();

		for (int i = 0; i < testString.length(); i++) {
			if (mapOfChars.isEmpty()) {
				mapOfChars.put(String.valueOf(testString.charAt(i)), 0);
			} else {
				if (mapOfChars
						.containsKey(String.valueOf(testString.charAt(i)))) {
					System.out.println("NOT UNIQUE");
					break;
				} else {
					mapOfChars.put(String.valueOf(testString.charAt(i)), 0);
				}
			}
		}

		System.out.println("" + isUniqueChars(testString)
				+ isUniqueChars2(testString));
	}

	public static boolean isUniqueChars(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); ++i) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val);
		}
		return true;
	}

	public static boolean isUniqueChars2(String str) {
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val])
				return false;
			char_set[val] = true;
		}
		return true;
	}
}
