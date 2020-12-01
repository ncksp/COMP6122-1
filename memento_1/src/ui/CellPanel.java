package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ui.memento.CellMemento;

public class CellPanel extends JPanel {
	private Frame frame;
	private JLabel label, count;
	private Color currentColor;
	private int counter;

	public CellPanel(Frame frame, int i) {
		this.frame = frame;

		counter = 0;
		currentColor = Color.black;

		setBackground(currentColor);

		label = new JLabel(i + "");
		count = new JLabel(counter + "");

		label.setForeground(Color.white);
		count.setForeground(Color.white);

		setLayout(new BorderLayout());
		setBorder(BorderFactory.createLineBorder(Color.white));
		add(BorderLayout.NORTH, label);
		add(BorderLayout.SOUTH, count);

		addMouseListener(new CellMouseListener(this));
	}

	public CellMemento createMemento() {
		return new CellMemento(currentColor, counter);
	}

	public void setPanel(CellMemento memento) {
		this.counter = memento.getCounter();
		count.setText(counter + "");

		this.currentColor = memento.getCurrentColor();
		this.setBackground(currentColor);
	}

	public void randomBackground() {
		Color newColor = randomColor();
		while (newColor == currentColor)
			newColor = randomColor();

		currentColor = newColor;
		setBackground(currentColor);
	}

	public void increaseCounter() {
		count.setText(++counter + "");
	}

	public void resetBackground() {
		setBackground(Color.black);
	}

	private Random r = new Random();

	private Color randomColor() {
		switch (r.nextInt(3)) {
		case 0:
			return Color.red;
		case 1:
			return Color.green;
		case 2:
			return Color.blue;
		}
		return Color.white;
	}

	public Frame getFrame() {
		return frame;
	}
}
