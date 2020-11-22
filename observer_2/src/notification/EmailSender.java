package notification;

import event.Event;
import event.GPAUpdated;
import model.PersonalData;
import model.Student;
import observer.Observer;

public class EmailSender implements Observer<Event> {

	public void send(Email email) {
		System.out.printf("send to %s, title: %s, body: %s\n", email.getTo(), email.getTitle(), email.getBody());
	}

	@Override
	public void update(Event e) {
		if (e instanceof GPAUpdated) {
			Student s = ((GPAUpdated) e).getStudent();
			PersonalData studentData = s.getStudentData();
			PersonalData parentData = s.getParentData();

			String title = "gpa updated";
			Email emailToStudent = new Email(studentData.getEmail(), title, "Lorem ipsum");
			Email emailToParent = new Email(parentData.getEmail(), title, "Lorem ipsum");

			this.send(emailToStudent);
			this.send(emailToParent);
		}
	}
}
