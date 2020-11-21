package component;

import java.util.Vector;

public class Folder extends Component {
	private Vector<Component> components;

	public Folder(String name) {
		super(name);
		components = new Vector<Component>();
	}

	public void add(Component c) {
		components.add(c);
	}

	public void remove(Component c) {
		components.remove(c);
	}

	@Override
	public void open() {
		System.out.println("opening folder...");
	}

	@Override
	public void rename(String name) {
		System.out.println("renaming folder...");
	}

	@Override
	protected void printUsingIndentation(int indentation) {
		printIndent(indentation);
		System.out.println(name);

		for (Component c : components) {
			c.printUsingIndentation(indentation + 2);
		}
	}
}