package ui.command;

import ui.CellPanel;
import ui.memento.Caretaker;

public abstract class CellCommand implements Cloneable {
	protected CellPanel receiver;

	public CellCommand(CellPanel receiver) {
		super();
		this.receiver = receiver;
	}

	public abstract void execute();

	public abstract void rollback();

	protected void snapshot() {
		Caretaker.instance().addMemento(this.clone());
	}

	protected abstract CellCommand clone();
}
