package notification;

public class Sms {
	private String phone;
	private String message;

	public Sms(String phone, String message) {
		super();
		this.phone = phone;
		this.message = message;
	}

	public String getPhone() {
		return phone;
	}

	public String getMessage() {
		return message;
	}
}
