package event;

import model.ChatMember;

public class Added extends ChatEvent {

	public Added(ChatMember member) {
		super(member);
	}

	@Override
	public String toString() {
		return "added event: " + member.getName();
	}
}
