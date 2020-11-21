package sorter;

public class DescSorter extends IntegerSorter {

	@Override
	protected boolean isSorted(int a, int b) {
		return a > b;
	}
}