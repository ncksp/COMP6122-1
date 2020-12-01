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
		return new UndoCommand(receiver);
	}

}
