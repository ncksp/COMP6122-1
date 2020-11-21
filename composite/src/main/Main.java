package main;

import component.File;
import component.Folder;

public class Main {
	public Main() {
		Folder root = new Folder("GoF");
		Folder folder1 = new Folder("creational.txt");
		Folder folder2 = new Folder("structural.txt");
		Folder folder3 = new Folder("behavioral.txt");

		root.add(folder1);
		root.add(folder2);
		root.add(folder3);

		folder1.add(new File("prototype.txt"));
		folder1.add(new File("singleton.txt"));

		folder2.add(new File("adapter.txt"));
		folder2.add(new File("composite.txt"));
		folder2.add(new File("decorator.txt"));

		folder3.add(new File("observer.txt"));
		folder3.add(new File("strategy.txt"));

		root.print();
	}

	public static void main(String[] args) {
		new Main();
	}

}
