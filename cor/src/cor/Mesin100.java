package cor;

public class Mesin100 extends Mesin {

	public Mesin100(Mesin successor) {
		super(successor);
	}

	@Override
	public void tarik(int amount) {
		while (amount >= 100) {
			amount -= 100;
			System.out.println("keluar uang 100k");
		}

		successor.tarik(amount);
	}

	@Override
	public boolean validate(int amount) {
		int n = amount / 100;
		amount -= n * 100;

		if (amount == 0)
			return true;

		return successor.validate(amount);
	}

}
