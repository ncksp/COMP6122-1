package notification;

public class Email {
	private String to;
	private String title;
	private String body;

	public Email(String to, String title, String body) {
		super();
		this.to = to;
		this.title = title;
		this.body = body;
	}

	public String getTo() {
		return to;
	}

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}
}
