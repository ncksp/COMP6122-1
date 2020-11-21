package player.accessories;

import player.Drawable;

public class Hat extends Decorator {
	private String image;

	public Hat(Drawable wrappee, String image) {
		super(wrappee);
		this.image = image;
	}

	@Override
	public void draw() {
		this.wrappee.draw();
		System.out.println("gambar topi: " + image);
	}
}
