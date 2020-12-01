package ui;

import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.JFrame;

import ui.command.CellCommand;
import ui.command.RandomBackgroundCommand;
import ui.command.UndoCommand;

public class Frame extends JFrame {
	private Vector<CellPanel> cells;

	public Frame() {
		initCellsAndListener();
		setup();
	}

	private void initCellsAndListener() {
		setLayout(new GridLayout(3, 3));
		HashMap<Character, CellCommand> cmds = new HashMap<>();
		cells = new Vector<>();
		for (int i = 1; i <= 3 * 3; i++) {
			CellPanel cell = new CellPanel(this, i);
			cells.add(cell);
			add(cell);
			cmds.put((char) (i + '0'), new RandomBackgroundCommand(cell));
		}

		cmds.put('z', new UndoCommand(cells.firstElement()));
		addKeyListener(new FrameKeyListener(cmds));
	}

	private void setup() {
		setSize(150, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
