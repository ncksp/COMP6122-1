package main;

import java.util.Vector;

import sorter.AscSorter;

public class Main {
	public Main() {
		Vector<Integer> ints = new Vector<>();
		ints.add(5);
		ints.add(3);
		ints.add(8);
		ints.add(1);
		ints.add(2);

		new AscSorter().sort(ints);

		for (int i : ints) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		new Main();
	}
}
