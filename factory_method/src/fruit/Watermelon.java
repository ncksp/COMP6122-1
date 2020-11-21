package fruit;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Watermelon extends Fruit {
	private static final String url = "/images/watermelon.png";

	@Override
	public Image image() {
		return new ImageIcon(this.getClass().getResource(url)).getImage();
	}

}