package sorter;

public class AscSorter extends IntegerSorter {

	@Override
	protected boolean isSorted(int a, int b) {
		return a < b;
	}
}