package component;

import java.util.Iterator;

public abstract class Component implements Iterable<Component> {
	protected String name;
	protected Component parent;

	public Component(String name) {
		this.name = name;
	}

	@Override
	public Iterator<Component> iterator() {
		return new BFS(this);
	}

	protected String getPath() {
		String path = "";

		Component curr = parent;
		while (curr != null) {
			path = curr.name + "/" + path;
			curr = curr.parent;
		}

		return path;
	}
}