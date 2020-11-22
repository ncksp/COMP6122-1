package model;

import observer.Observer;

public class JobSeeker implements Observer {
	private String name;

	public JobSeeker(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println(name + " mendapat pesan " + message);
	}

}
