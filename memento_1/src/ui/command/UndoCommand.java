package ui.command;

import ui.CellPanel;
import ui.memento.Caretaker;
import ui.memento.Memento;

public class UndoCommand extends CellCommand {

	public UndoCommand(CellPanel receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		Memento memento = Caretaker.instance().undo();
		if (null == memento)
			return;

		receiver.getFrame().loadFromMemento(memento);
	}

}
