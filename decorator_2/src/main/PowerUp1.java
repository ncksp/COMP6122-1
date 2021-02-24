package main;

public class PowerUp1 extends PowerUp {

	public PowerUp1(Weapon wrapped) {
		super(wrapped);
	}

	@Override
	public double getDamage() {
		return this.wrapped.getDamage() * 1.1;
	}

	@Override
	public double getAspd() {
		return this.wrapped.getAspd();
	}

}
