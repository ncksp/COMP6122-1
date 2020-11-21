package payment;

public class GoPay extends Payment {
	// ...

	@Override
	public void pay(int price) {
		System.out.println("pay using gopay...");
	}
}