package event;

import model.ChatMember;

public class Message extends ChatEvent {
	private String message;

	public Message(ChatMember member, String message) {
		super(member);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "message event: " + message;
	}
}
