package progground;

public class ReverseCStyleStr {
	public static void main(String[] args) {
		/*
		 * Write code to reverse a C-Style String. (C-String means that “abcd”
		 * is represented as five characters, including the null character.)
		 */
		String cstylestring = "style";

		System.out.println(cstylestring.split("").length);

		String[] array = cstylestring.split("");
		String[] revArray = new String[array.length];

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i] + "!");
			revArray[i] = array[i];
		}

		for (int i = revArray.length - 1; i >= 0; i--) {
			System.out.println(revArray[i] + "!");
		}
	}
}
