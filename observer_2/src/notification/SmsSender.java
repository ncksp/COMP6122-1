package notification;

import event.Event;
import event.GPAUpdated;
import model.PersonalData;
import model.Student;
import observer.Observer;

public class SmsSender implements Observer<Event> {
	public void send(Sms sms) {
		System.out.printf("send to %s, message: %s\n", sms.getPhone(), sms.getMessage());
	}

	@Override
	public void update(Event e) {
		if (e instanceof GPAUpdated) {
			Student s = ((GPAUpdated) e).getStudent();
			PersonalData studentData = s.getStudentData();
			PersonalData parentData = s.getParentData();

			Sms smsToStudent = new Sms(studentData.getPhone(), "gpa updated: " + s.getGpa());
			Sms smsToParent = new Sms(parentData.getPhone(), "gpa updated: " + s.getGpa());

			this.send(smsToStudent);
			this.send(smsToParent);
		}
	}
}
