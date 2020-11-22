package event;

import model.Student;

public class GPAUpdated extends Event {
	private Student student;

	public GPAUpdated(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}
}
