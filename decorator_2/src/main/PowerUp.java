package main;

import java.util.Stack;

public abstract class PowerUp extends Weapon {
	protected Weapon wrapped;

	public PowerUp(Weapon wrapped) {
		super();
		this.wrapped = wrapped;
	}

	public Weapon remove(Class<?> toBeRemoved) {
		if (this.getClass().equals(toBeRemoved)) {
			return this.wrapped;
		}

		Stack<Weapon> stack = new Stack<>();

		Weapon temp = this;
		while (temp != null) {
			if (temp.getClass().equals(toBeRemoved)) {
				if (temp instanceof PowerUp) {
					temp = ((PowerUp) temp).wrapped;
				} else {
					temp = null;
				}
				continue;
			}

			stack.push(temp);
			if (temp instanceof PowerUp) {
				temp = ((PowerUp) temp).wrapped;
			} else {
				temp = null;
			}
		}

		Weapon result = stack.pop();
		while (!stack.empty()) {
			Weapon w = stack.pop();
			if (w instanceof PowerUp) {
				((PowerUp) w).wrapped = result;
				result = w;
			}
		}

		return result;
	}

}
