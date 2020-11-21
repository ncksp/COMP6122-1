package cart;

import java.util.Vector;

import payment.Payment;

public class ShoppingCart {
	private Payment payment;
	private Vector<Item> items = new Vector<>();

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public void pay() {
		if (payment == null)
			throw new RuntimeException("payment is not set");
		if (items.isEmpty())
			throw new RuntimeException("no item");

		payment.pay(getTotalPrice());
	}

	private int getTotalPrice() {
		int total = 0;
		for (Item item : items) {
			total += item.getPrice();
		}

		return total;
	}

	public void addItem(Item item) {
		items.add(item);
	}
}