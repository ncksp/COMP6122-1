package ui.command;

import ui.CellPanel;

public abstract class CellCommand {
	protected CellPanel receiver;

	public CellCommand(CellPanel receiver) {
		super();
		this.receiver = receiver;
	}

	public abstract void execute();

	protected void snapshot() {
		this.receiver.getFrame().snapshot();
	}
}
