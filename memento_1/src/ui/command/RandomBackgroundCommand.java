package ui.command;

import ui.CellPanel;

public class RandomBackgroundCommand extends CellCommand {

	public RandomBackgroundCommand(CellPanel receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		snapshot();
		this.receiver.randomBackground();
	}

}
