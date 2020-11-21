package display;

import fruit.Fruit;

public abstract class Display {
	protected abstract Fruit currentFruit();

	public void show() {
		Fruit fruit = currentFruit();
		this.changeScreen(fruit);
	}

	protected void changeScreen(Fruit fruit) {
		System.out.println("menampilkan " + fruit.getClass());
	}

	// other implementation removed for brevity
}