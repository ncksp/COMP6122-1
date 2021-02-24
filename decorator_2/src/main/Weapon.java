package main;

public abstract class Weapon {
	public abstract double getDamage();

	public abstract double getAspd();

	/**
	 * dps = damage per second
	 * 
	 * @return
	 */
	public double dps() {
		return getDamage() * getAspd();
	}
}
