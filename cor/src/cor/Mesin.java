package cor;

public abstract class Mesin {
	protected Mesin successor;

	public Mesin(Mesin successor) {
		super();
		this.successor = successor;
	}

	public abstract void tarik(int amount);

	public abstract boolean validate(int amount);
}
