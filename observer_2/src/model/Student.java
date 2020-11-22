package model;

import notification.Email;
import notification.EmailSender;
import notification.Sms;
import notification.SmsSender;

public class Student {
	private double gpa;
	private PersonalData student;
	private PersonalData parent;

	private EmailSender emailSender;
	private SmsSender smsSender;

	public Student() {
		emailSender = new EmailSender();
		smsSender = new SmsSender();
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;

		String title = "gpa updated";
		Email emailToStudent = new Email(student.getEmail(), title, "Lorem ipsum");
		Email emailToParent = new Email(parent.getEmail(), title, "Lorem ipsum");

		emailSender.send(emailToStudent);
		emailSender.send(emailToParent);

		Sms smsToStudent = new Sms(student.getPhone(), "Lorem ipsum");
		Sms smsToParent = new Sms(parent.getPhone(), "Lorem ipsum");

		smsSender.send(smsToStudent);
		smsSender.send(smsToParent);
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

	// ... other implementation removed for brevity
}
