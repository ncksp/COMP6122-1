package ui.command;

import ui.CellPanel;

public class CounterCommand extends CellCommand {

	public CounterCommand(CellPanel receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		snapshot();
		this.receiver.increaseCounter();
	}

}
