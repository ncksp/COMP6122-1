package cor2;

public class Main {
	public static void main(String[] args) {
		BeliAlkohol controller = new BeliAlkohol();
		CheckAge checkAge = new CheckAge(controller);
		Auth auth = new Auth(checkAge);

		auth.next(null);
	}
}
