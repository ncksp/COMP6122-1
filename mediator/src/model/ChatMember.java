package model;

import event.ChatEvent;
import event.Message;

public abstract class ChatMember {
	protected String name;
	private ChatRoom room;

	public ChatMember(ChatRoom room, String name) {
		super();
		this.room = room;
		this.name = name;

		room.addMember(this);
	}

	public String getName() {
		return name;
	}

	private void broadcast(ChatEvent e) {
		System.out.println(name + " mengirim: " + e);
		this.room.broadcast(e);
	}

	protected void talk(String message) {
		;
		broadcast(new Message(this, message));
	}

	public abstract void receive(ChatEvent e);
}
