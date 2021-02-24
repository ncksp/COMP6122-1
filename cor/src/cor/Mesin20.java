package cor;

public class Mesin20 extends Mesin {

	public Mesin20(Mesin successor) {
		super(successor);
	}

	@Override
	public void tarik(int amount) {
		while (amount >= 20) {
			amount -= 20;
			System.out.println("keluar uang 20k");
		}

		successor.tarik(amount);
	}

	@Override
	public boolean validate(int amount) {
		int n = amount / 20;
		amount -= n * 20;

		if (amount == 0)
			return true;

		return successor.validate(amount);
	}
}
