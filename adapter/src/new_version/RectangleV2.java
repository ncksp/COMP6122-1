package new_version;

import old_version.Rectangle;

public class RectangleV2 implements Shape {
	private Rectangle adaptee;

	public RectangleV2() {
		adaptee = new Rectangle();
	}

	public void display(int x1, int y1, int x2, int y2) {
		if (x2 < x1)
			throw new IllegalArgumentException("x2 must be greater than x1");
		if (y2 < y1)
			throw new IllegalArgumentException("y2 must be greater than y1");

		adaptee.display(x1, y1, x2 - x1, y2 - y1);
	}
}