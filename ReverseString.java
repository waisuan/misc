package progground.v2;

public class ReverseString {

	public static void main(String[] args) {
		// reverseNormalString();

		// reverseStackString();

		// reverseQueueString();

		reverseLinkedListString();
	}

	private static void reverseNormalString() {
		String toReverse = "abcdefghijkl";

		String[] splitString = toReverse.split("");

		// System.out.println(splitString.length);

		for (int i = splitString.length - 1; i >= 0; i--) {
			System.out.println(splitString[i]);
		}
	}

	private static void reverseStackString() {

		StackArray<String> stack = new StackArray<String>();

		stack.push("a");
		stack.push("b");
		stack.push("c");

		System.out.println(stack.toString());
	}

	private static void reverseQueueString() {
		QueueArray<String> q = new QueueArray<String>();

		q.enqueue("a");
		q.enqueue("b");
		q.enqueue("c");

		System.out.println(q.toString());
	}

	private static void reverseLinkedListString() {
		NormalLinkedList<String> nll = new NormalLinkedList<String>();

		nll.add("a");
		nll.add("b");
		nll.add("c");
		nll.add("d");
		nll.add("e");

		System.out.println(nll.toString());

		nll.remove(1);

		System.out.println(nll.toString());
	}
}
