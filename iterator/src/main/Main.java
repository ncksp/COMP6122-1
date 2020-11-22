package main;

import component.Component;
import component.File;
import component.Folder;

public class Main {
	public Main() {
		Folder root = new Folder("root");
		Folder folderA = new Folder("A");
		Folder folderB = new Folder("B");

		root.add(folderA);
		root.add(folderB);

		Folder folderA1 = new Folder("A1");
		folderA.add(folderA1);

		folderA1.add(new File("1.txt"));
		folderA1.add(new File("2.txt"));
		folderA1.add(new File("3.txt"));

		folderA.add(new File("4.txt"));

		folderB.add(new File("5.txt"));
		folderB.add(new File("6.txt"));

		Folder folderB1 = new Folder("B1");
		folderB.add(folderB1);

		folderB1.add(new File("7.txt"));
		folderB1.add(new File("8.txt"));

		for (Component c : root) {
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		new Main();
	}

}
