package main;

import display.Display;
import display.FixedDisplay;
import display.RandomDisplay;

public class Main {
	public Main() {
		Display d = new RandomDisplay();
		d.show(); // random fruit

		Display d2 = new FixedDisplay(new String[] { "grape", "watermelon" });
		d2.show(); // Grape
		d2.show(); // Watermelon
		d2.show(); // Grape
	}

	public static void main(String[] args) {
		new Main();
	}
}
