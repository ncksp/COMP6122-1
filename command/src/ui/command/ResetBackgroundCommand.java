package ui.command;

import ui.CellPanel;

public class ResetBackgroundCommand extends CellCommand {

	public ResetBackgroundCommand(CellPanel receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		this.receiver.resetBackground();
	}

}
