package model;

import java.util.Vector;

import event.Added;
import event.ChatEvent;
import event.Message;
import event.Removed;

public class ChatRoom {
	private Vector<ChatMember> members;

	public ChatRoom() {
		members = new Vector<ChatMember>();
	}

	public void addMember(ChatMember member) {
		this.members.add(member);
		broadcast(new Added(member));
	}

	public void removeMember(ChatMember member) {
		this.members.remove(member);
		broadcast(new Removed(member));
	}

	public void talk(ChatMember member, String message) {
		broadcast(new Message(member, message));
	}

	private void broadcast(ChatEvent e) {
		for (ChatMember m : members) {
			m.receive(e);
		}
	}
}
