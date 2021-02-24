package main;

public class PowerUp2 extends PowerUp {

	public PowerUp2(Weapon wrapped) {
		super(wrapped);
	}

	@Override
	public double getDamage() {
		return this.wrapped.getDamage() + 20;
	}

	@Override
	public double getAspd() {
		return this.wrapped.getAspd() + 0.1;
	}

}
