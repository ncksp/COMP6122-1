package main;

import model.PersonalData;
import model.Student;
import notification.EmailSender;
import notification.SmsSender;

public class Main {
	public Main() {
		PersonalData student = new PersonalData("a.b@c", "085", "Amir");
		PersonalData parent = new PersonalData("x.y@z", "021", "Budi");
		Student s = new Student(student, parent);

		s.addObserver(new SmsSender());
		s.addObserver(new EmailSender());

		s.setGpa(3.5);
	}

	public static void main(String[] args) {
		new Main();
	}
}
