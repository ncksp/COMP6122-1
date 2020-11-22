package event;

import model.ChatMember;

public class Removed extends ChatEvent {

	public Removed(ChatMember member) {
		super(member);
	}

	@Override
	public String toString() {
		return "removed event: " + member.getName();
	}
}
