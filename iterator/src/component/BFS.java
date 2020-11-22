package component;

import java.util.Iterator;
import java.util.Vector;

public class BFS implements Iterator<Component> {
	private Vector<Component> data;
	private int index;

	public BFS(Component current) {
		data = new Vector<>();
		index = 0;

		fillData(current);
	}

	private void fillData(Component current) {
		data.add(current);
		if (!isComposite(current))
			return;

		for (Component c : ((HasComposite) current).getComposite()) {
			fillData(c);
		}
	}

	private boolean isComposite(Component c) {
		return c instanceof HasComposite;
	}

	@Override
	public boolean hasNext() {
		return index < data.size();
	}

	@Override
	public Component next() {
		if (!hasNext())
			return null;

		return data.elementAt(index++);
	}
}
