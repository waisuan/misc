package progground.v2;

public interface StackInterface<T> {

	StackInterface<T> push(T element);

	T pop();
}
