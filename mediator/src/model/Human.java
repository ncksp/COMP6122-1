package model;

import event.ChatEvent;

public class Human extends ChatMember {

	public Human(ChatRoom room, String name) {
		super(room, name);
	}

	@Override
	public void receive(ChatEvent e) {
		// skip jika event dari diri sendiri
		if (this.equals(e.getMember()))
			return;

		System.out.println(name + " mendapat: " + e);
	}

	public void chat(String message) {
		talk(message);
	}
}