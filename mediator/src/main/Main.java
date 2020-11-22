
package main;

import model.Bot;
import model.ChatRoom;
import model.Human;

public class Main {
	public Main() {
		ChatRoom room = new ChatRoom();

		Human amir = new Human(room, "Amir");
		Human budi = new Human(room, "Budi");
		Bot bot = new Bot(room, "Auto Reply");

		amir.chat("halo budi");
		budi.chat("itu bot berisik amat");
		room.removeMember(bot);
	}

	public static void main(String[] args) {
		new Main();
	}
}
