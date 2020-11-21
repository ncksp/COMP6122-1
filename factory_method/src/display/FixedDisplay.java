package display;

import fruit.*;

public class FixedDisplay extends Display {
	private String[] sequence;
	private int idx;

	public FixedDisplay(String[] sequence) {
		this.sequence = sequence;
		this.idx = 0;
	}

	@Override
	public Fruit currentFruit() {
		String type = this.sequence[idx++];
		if (idx >= this.sequence.length)
			idx = 0;

		if (type.equals("grape"))
			return new Grape();
		if (type.equals("orange"))
			return new Orange();
		if (type.equals("watermelon"))
			return new Watermelon();

		return null;
	}
}