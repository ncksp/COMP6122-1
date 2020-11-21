package sorter;

import java.util.Vector;

public abstract class IntegerSorter {
	protected abstract boolean isSorted(int a, int b);

	public void sort(Vector<Integer> integers) {
		int n = integers.size();

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				int a = integers.elementAt(j);
				int b = integers.elementAt(j + 1);

				if (isSorted(a, b))
					continue;

				integers.setElementAt(b, j);
				integers.setElementAt(a, j + 1);
			}
		}
	}
}