package ui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

import ui.command.CellCommand;
import ui.command.RandomAndCountCommand;
import ui.command.ResetBackgroundCommand;

public class CellMouseListener implements MouseListener {
	private HashMap<Integer, CellCommand> commandMap;

	public CellMouseListener(CellPanel cell) {
		commandMap = new HashMap<>();
		commandMap.put(MouseEvent.BUTTON1, new RandomAndCountCommand(cell));
		commandMap.put(MouseEvent.BUTTON3, new ResetBackgroundCommand(cell));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		CellCommand cmd = commandMap.get(e.getButton());
		if (null == cmd)
			return;

		cmd.execute();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
