package observer;

public interface Observable<T> {
	public void broadcast(T message);

	public void addObserver(Observer<T> obs);
}
