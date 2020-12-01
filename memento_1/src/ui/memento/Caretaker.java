package ui.memento;

import java.util.Stack;

public class Caretaker {
	private Stack<Memento> mementos;
	private static Caretaker instance;

	private Caretaker() {
		mementos = new Stack<>();
	}

	public static Caretaker instance() {
		if (null == instance) {
			synchronized (Caretaker.class) {
				if (null == instance) {
					instance = new Caretaker();
				}
			}
		}
		return instance;
	}

	public void addMemento(Memento m) {
		mementos.push(m);
	}

	public Memento undo() {
		if (mementos.empty())
			return null;

		return mementos.pop();
	}
}
