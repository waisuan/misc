package progground.v2;

public class StackArray<T> implements StackInterface<T> {

	private T[] array;

	private int total;

	public StackArray() {
		array = (T[]) new Object[2];
	}

	public void resize(int capacity) {
		T[] tmp = (T[]) new Object[capacity];

		System.arraycopy(array, 0, tmp, 0, total);
		array = tmp;
	}

	@Override
	public StackInterface<T> push(T element) {
		if (array.length == total)
			resize(array.length * 2);
		array[total++] = element;
		return this;
	}

	@Override
	public T pop() {
		if (total == 0)
			throw new java.util.NoSuchElementException();

		T ele = array[--total];
		array[total] = null;
		if (total > 0 && total == array.length / 4) // quarter
			resize(array.length / 2); // half

		return ele;
	}

	@Override
	public String toString() {
		return java.util.Arrays.toString(array);
	}

}
