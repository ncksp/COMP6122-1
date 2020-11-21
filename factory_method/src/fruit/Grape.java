package fruit;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Grape extends Fruit {
	private static final String url = "/images/grape.png";

	@Override
	public Image image() {
		return new ImageIcon(this.getClass().getResource(url)).getImage();
	}

}