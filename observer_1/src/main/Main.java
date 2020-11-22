package main;

import model.HeadHunter;
import model.JobSeeker;

public class Main {
	public Main() {
		JobSeeker amir = new JobSeeker("Amir");
		JobSeeker budi = new JobSeeker("Budi");
		JobSeeker charlie = new JobSeeker("Charlie");

		HeadHunter xyz = new HeadHunter("PT. XYZ");
		HeadHunter abc = new HeadHunter("PT. ABC");

		// PT. XYZ di-subscribe oleh Amir dan Budi
		xyz.addObserver(amir);
		xyz.addObserver(budi);

		// PT. ABC di-subscribe oleh Amir dan Charlie
		abc.addObserver(amir);
		abc.addObserver(charlie);

		xyz.broadcastJob("Backend Engineer");

		System.out.println("");

		abc.broadcastJob("Android Engineer");
	}

	public static void main(String[] args) {
		new Main();
	}
}
