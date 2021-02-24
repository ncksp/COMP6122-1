package main;

public class Main {
	public static void main(String[] args) {
		Weapon w = new Bow();
		w = new PowerUp1(w);
		w = new PowerUp2(w);

		System.out.printf("%.2f\n", w.dps());

		w = ((PowerUp) w).remove(PowerUp1.class);

		System.out.printf("%.2f\n", w.dps());
	}
}
