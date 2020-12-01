package ui.command;

import java.awt.Color;

import ui.CellPanel;

public class RandomBackgroundCommand extends CellCommand {
	private Color before;

	public RandomBackgroundCommand(CellPanel receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		before = receiver.getCurrentColor();
		this.receiver.randomBackground();
		snapshot();
	}

	@Override
	public void rollback() {
		this.receiver.setBackground(before);
	}

	@Override
	protected CellCommand clone() {
		RandomBackgroundCommand c = new RandomBackgroundCommand(receiver);
		c.before = this.before;

		return c;
	}
}
