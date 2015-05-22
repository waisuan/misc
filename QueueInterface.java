package progground.v2;

public interface QueueInterface<T> {

	QueueInterface<T> enqueue(T ele);

	T dequeue();
}
