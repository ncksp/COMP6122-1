package observer;

public interface Observable {
	public void broadcast(String message);

	public void addObserver(Observer obs);
}
