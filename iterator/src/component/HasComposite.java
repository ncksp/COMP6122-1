package component;

import java.util.Vector;

interface HasComposite {
	public void add(Component c);

	Vector<Component> getComposite();
}
