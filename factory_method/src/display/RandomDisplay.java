package display;

import java.util.Random;

import fruit.Fruit;
import fruit.Grape;
import fruit.Orange;
import fruit.Watermelon;

public class RandomDisplay extends Display {
	@Override
	public Fruit currentFruit() {
		Random rand = new Random();
		int r = rand.nextInt(3);

		if (r == 0)
			return new Grape();
		if (r == 1)
			return new Orange();
		if (r == 2)
			return new Watermelon();

		return null;
	}

}