package main;

import shape.Circle;
import shape.Red;
import shape.Shape;

public class Main {
	public Main() {
		Shape s = new Circle(new Red());
		s.display();
	}

	public static void main(String[] args) {
		new Main();
	}
}
