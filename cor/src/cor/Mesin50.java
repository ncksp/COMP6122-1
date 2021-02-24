package cor;

public class Mesin50 extends Mesin {

	public Mesin50(Mesin successor) {
		super(successor);
	}

	@Override
	public void tarik(int amount) {
		while (amount >= 50) {
			amount -= 50;
			System.out.println("keluar uang 50k");
		}

		successor.tarik(amount);
	}

	@Override
	public boolean validate(int amount) {
		int n = amount / 50;
		amount -= n * 50;

		if (amount == 0)
			return true;

		return successor.validate(amount);
	}

}
