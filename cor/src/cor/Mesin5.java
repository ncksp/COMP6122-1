package cor;

public class Mesin5 extends Mesin {

	public Mesin5(Mesin successor) {
		super(successor);
	}

	@Override
	public void tarik(int amount) {
		while (amount >= 5) {
			amount -= 5;
			System.out.println("keluar uang 5k");
		}

		successor.tarik(amount);
	}

	@Override
	public boolean validate(int amount) {
		int n = amount / 5;
		amount -= n * 5;

		if (amount == 0)
			return true;

		return successor.validate(amount);
	}
}
