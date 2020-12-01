package ui.memento;

import java.util.Stack;

import ui.command.CellCommand;

public class Caretaker {
	private Stack<CellCommand> mementos;
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

	public void addMemento(CellCommand m) {
		mementos.push(m);
	}

	public CellCommand undo() {
		if (mementos.empty())
			return null;

		return mementos.pop();
	}
}
