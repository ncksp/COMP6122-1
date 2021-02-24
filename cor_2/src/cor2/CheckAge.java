package cor2;

public class CheckAge extends Middleware {

	public CheckAge(Controller successor) {
		super(successor);
	}

	@Override
	public void next(Object request) {
		if (isOlderThan21()) {
			this.successor.next(request);
			return;
		}

		System.out.println("tidak sesuai umur");
	}

	private boolean isOlderThan21() {
		return true;
	}

}
