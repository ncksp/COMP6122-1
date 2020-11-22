package component;

import java.util.Vector;

public class Folder extends Component implements HasComposite {
	private Vector<Component> components;

	public Folder(String name) {
		super(name);
		components = new Vector<Component>();
	}

	@Override
	public void add(Component c) {
		components.add(c);
		c.parent = this;
	}

	@Override
	public Vector<Component> getComposite() {
		return components;
	}

	@Override
	public String toString() {
		return getPath() + name;
	}
}