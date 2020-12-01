package ui.command;

import ui.CellPanel;

public class CounterCommand extends CellCommand {

	public CounterCommand(CellPanel receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		this.receiver.increaseCounter();
		snapshot();
	}

	@Override
	public void rollback() {
		this.receiver.decreaseCounter();
	}

	@Override
	protected CellCommand clone() {
		return new CounterCommand(receiver);
	}

}
