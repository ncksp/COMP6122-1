package model;

import event.ChatEvent;
import event.Message;

public class Bot extends ChatMember {

	public Bot(ChatRoom room, String name) {
		super(room, name);
	}

	@Override
	public void receive(ChatEvent e) {
		// skip jika event dari diri sendiri
		if (this.equals(e.getMember()))
			return;

		System.out.println("[Bot] " + name + " mendapat: " + e);

		if (e instanceof Message) {
			Message msg = (Message) e;
			talk("saya tidak mengerti maksud dari '" + msg.getMessage() + "'");
		}
	}

}