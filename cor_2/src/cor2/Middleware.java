package cor2;

public abstract class Middleware implements Controller {
	protected Controller successor;

	public Middleware(Controller successor) {
		super();
		this.successor = successor;
	}

}
