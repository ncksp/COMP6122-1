package player.accessories;

import player.Drawable;

public class Skin extends Decorator {
	private String image;

	public Skin(Drawable wrappee, String image) {
		super(wrappee);
		this.image = image;
	}

	@Override
	public void draw() {
		this.wrappee.draw();
		System.out.println("gambar baju: " + image);
	}
}
