package main;

import player.Basic;
import player.Color;
import player.Drawable;
import player.accessories.Hat;
import player.accessories.Skin;

public class Main {
	public Main() {
		Drawable c = new Basic(Color.RED, "Terawan");
		c.draw();

		System.out.println("");

		Drawable c2 = new Basic(Color.RED, "Terawan");
		c2 = new Hat(c2, "topi ulang tahun");
		c2.draw();

		System.out.println("");

		Drawable c3 = new Basic(Color.RED, "Terawan");
		c3 = new Hat(c3, "topi ulang tahun");
		c3 = new Skin(c3, "baju dokter");
		c3.draw();
	}

	public static void main(String[] args) {
		new Main();
	}
}
