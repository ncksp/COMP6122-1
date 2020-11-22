package component;

public class File extends Component {
	public File(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return getPath() + name;
	}
}