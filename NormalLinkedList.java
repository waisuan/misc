package progground.v2;

public class NormalLinkedList<T> {

	private int lengthOfList;
	private Node head;

	private class Node {
		private T ele;
		private Node next;
	}

	public NormalLinkedList() {
		head = new Node();

		lengthOfList = 0;
	}

	public void add(T ele) {

		Node newNode = new Node();
		newNode.ele = ele;
		newNode.next = null;

		Node curr = head;

		while (null != curr.next) {
			curr = curr.next;
		}

		curr.next = newNode;
		lengthOfList++;
	}

	public boolean remove(int index) {

		if (index < 0 || index > lengthOfList) {
			return false;
		}

		Node curr = head;

		for (int i = 0; i < index; i++) {
			if (curr.next == null) {
				return false;
			}

			curr = curr.next;
		}

		curr.next = curr.next.next;

		lengthOfList--;

		return true;
	}

	public String toString() {
		Node curr = head.next;
		String output = "";
		while (curr != null) {
			output += "[" + curr.ele.toString() + "]";
			curr = curr.next;
		}
		return output;
	}
}
