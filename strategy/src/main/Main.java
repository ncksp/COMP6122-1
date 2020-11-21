package main;

import cart.Item;
import cart.ShoppingCart;
import payment.GoPay;

public class Main {
	public Main() {
		ShoppingCart sc = new ShoppingCart();
		sc.addItem(new Item());

		sc.setPayment(new GoPay());
		sc.pay();
	}

	public static void main(String[] args) {
		new Main();
	}
}
