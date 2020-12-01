package ui.command;

import ui.CellPanel;
import ui.memento.Caretaker;

public class UndoCommand extends CellCommand {
	CellCommand redo;

	public UndoCommand(CellPanel receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		redo = Caretaker.instance().undo();
		redo.rollback();
		// command ini tidak di-snapshot
	}

	/*
	 * rollback method pada class ini belum dimanfaatkan.
	 * 
	 * Buat class Caretaker baru untuk prosedur redo
	 */
	@Override
	public void rollback() {
		if (null == redo)
			return;

		redo.execute();
	}

	@Override
	protected CellCommand clone() {
		UndoCommand c = new UndoCommand(receiver);
		c.redo = this.redo;

		return c;
	}

}
