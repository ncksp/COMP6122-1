package ui.command;

import java.util.Vector;

import ui.CellPanel;

public class RandomAndCountCommand extends CellCommand {
	private Vector<CellCommand> delegates;

	public RandomAndCountCommand(CellPanel receiver) {
		super(receiver);

		delegates = new Vector<CellCommand>();
		delegates.add(new RandomBackgroundCommand(receiver));
		delegates.add(new CounterCommand(receiver));
	}

	@Override
	public void execute() {
		snapshot();
		for (CellCommand d : delegates) {
			d.execute();
		}
	}

}
