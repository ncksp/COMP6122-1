package cor2;

public class Auth extends Middleware {

	public Auth(Middleware successor) {
		super(successor);
	}

	@Override
	public void next(Object request) {
		if (isJWTValid()) {
			this.successor.next(request);
			return;
		}

		System.out.println("gagal login");
	}

	private boolean isJWTValid() {
		return true;
	}

}
