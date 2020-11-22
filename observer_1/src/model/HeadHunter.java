package model;

import java.util.Vector;

import observer.Observable;
import observer.Observer;

public class HeadHunter implements Observable {
	private Vector<Observer> observers;

	private String name;

	public HeadHunter(String name) {
		this.name = name;
		observers = new Vector<>();
	}

	public void broadcastJob(String jobName) {
		broadcast(name + " mencari " + jobName);
	}

	@Override
	public void broadcast(String message) {
		for (Observer obs : observers) {
			obs.update(message);
		}
	}

	@Override
	public void addObserver(Observer obs) {
		observers.add(obs);
	}

	public String getName() {
		return name;
	}
}
