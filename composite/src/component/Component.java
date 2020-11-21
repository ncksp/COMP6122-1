package component;

public abstract class Component {
	protected String name;

	public Component(String name) {
		this.name = name;
	}

	public abstract void open();

	public abstract void rename(String name);

	public final void print() {
		printUsingIndentation(0);
	}

	protected abstract void printUsingIndentation(int indentation);

	protected void printIndent(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(" ");
		}
	}
}