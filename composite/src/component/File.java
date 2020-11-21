package component;

public class File extends Component {
	public File(String name) {
		super(name);
	}

	@Override
	public void open() {
		System.out.println("opening file...");
	}

	@Override
	public void rename(String name) {
		System.out.println("renaming file...");
	}

	@Override
	protected void printUsingIndentation(int indentation) {
		printIndent(indentation);
		System.out.println(name);
	}
}