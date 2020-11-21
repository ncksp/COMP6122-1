package player.accessories;

import player.Drawable;

public abstract class Decorator implements Drawable {
	protected Drawable wrappee;

	public Decorator(Drawable wrappee) {
		this.wrappee = wrappee;
	}
}