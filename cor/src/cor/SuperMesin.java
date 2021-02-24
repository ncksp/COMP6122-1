package cor;

/**
 * 
 * SuperMesin adalah versi generik dari Mesin5, Mesin20, Mesin50, Mesin100
 *
 */
public class SuperMesin extends Mesin {
	private int pecahan;

	public SuperMesin(Mesin successor, int pecahan) {
		super(successor);
		this.pecahan = pecahan;
	}

	@Override
	public void tarik(int amount) {
		while (amount >= pecahan) {
			amount -= pecahan;
			System.out.println("keluar uang " + pecahan + "k");
		}

		successor.tarik(amount);
	}

	@Override
	public boolean validate(int amount) {
		int n = amount / pecahan;
		amount -= n * pecahan;

		if (amount == 0)
			return true;

		return successor.validate(amount);
	}

}
