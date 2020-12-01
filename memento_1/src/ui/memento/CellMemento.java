package ui.memento;

import java.awt.Color;

public class CellMemento {
	private Color currentColor;
	private int counter;

	public CellMemento(Color currentColor, int counter) {
		super();
		this.currentColor = currentColor;
		this.counter = counter;
	}

	public int getCounter() {
		return counter;
	}

	public Color getCurrentColor() {
		return currentColor;
	}
}
