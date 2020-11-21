package player;

public class Basic implements Drawable {
	private String name;
	private Color color;

	public Basic(Color color, String name) {
		this.color = color;
		this.name = name;
	}

	@Override
	public void draw() {
		System.out.println("name " + name);
		System.out.println("drawing " + color);
	}
}
