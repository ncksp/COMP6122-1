package model;

import event.ChatEvent;

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

	protected void talk(String message) {
		System.out.println(name + " mengirim: " + message);
		room.talk(this, message);
	}

	public abstract void receive(ChatEvent e);
}
