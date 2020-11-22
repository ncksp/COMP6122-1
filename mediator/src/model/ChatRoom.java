package model;

import java.util.Vector;

import event.Added;
import event.ChatEvent;
import event.Removed;

public class ChatRoom {
	Vector<ChatMember> members;

	public ChatRoom() {
		members = new Vector<ChatMember>();
	}

	public void broadcast(ChatEvent e) {
		for (ChatMember m : members) {
			m.receive(e);
		}
	}

	public void addMember(ChatMember member) {
		this.members.add(member);
		broadcast(new Added(member));
	}

	public void removeMember(ChatMember member) {
		this.members.remove(member);
		broadcast(new Removed(member));
	}
}
