package event;

import model.ChatMember;

public abstract class ChatEvent {
	protected long timestamp;
	protected ChatMember member;

	public ChatEvent(ChatMember member) {
		this.timestamp = System.currentTimeMillis();
		this.member = member;
	}

	public ChatMember getMember() {
		return member;
	}

}
