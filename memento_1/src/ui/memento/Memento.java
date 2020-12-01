package ui.memento;

import java.util.Vector;

public class Memento {
	private Vector<CellMemento> state;

	public Memento(Vector<CellMemento> state) {
		super();
		this.state = state;
	}

	public Vector<CellMemento> getState() {
		return state;
	}
}
