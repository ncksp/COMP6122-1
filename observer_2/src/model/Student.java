package model;

import java.util.Vector;

import event.Event;
import event.GPAUpdated;
import observer.Observable;
import observer.Observer;

public class Student implements Observable<Event> {
	private double gpa;
	private PersonalData student;
	private PersonalData parent;

	private Vector<Observer<Event>> observers;

	public Student(PersonalData student, PersonalData parent) {
		this.student = student;
		this.parent = parent;

		observers = new Vector<>();
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
		broadcast(new GPAUpdated(this));
	}

	public double getGpa() {
		return gpa;
	}

	public PersonalData getStudentData() {
		return student;
	}

	public PersonalData getParentData() {
		return parent;
	}

	@Override
	public void broadcast(Event message) {
		for (Observer<Event> obs : observers) {
			obs.update(message);
		}
	}

	@Override
	public void addObserver(Observer<Event> obs) {
		observers.add(obs);
	}

	// ... other implementation removed for brevity
}
