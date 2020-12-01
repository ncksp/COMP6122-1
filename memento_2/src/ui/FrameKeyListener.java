package ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import ui.command.CellCommand;

public class FrameKeyListener implements KeyListener {
	private HashMap<Character, CellCommand> commandMap;

	public FrameKeyListener(HashMap<Character, CellCommand> commandMap) {
		super();
		this.commandMap = commandMap;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		CellCommand cmd = commandMap.get(e.getKeyChar());
		if (null == cmd)
			return;

		cmd.execute();
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
