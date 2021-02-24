package cor;

public class NullMesin extends Mesin {

	public NullMesin(Mesin successor) {
		super(successor);
	}

	public NullMesin() {
		super(null);
	}

	@Override
	public void tarik(int amount) {

	}

	@Override
	public boolean validate(int amount) {
		return false;
	}

}
