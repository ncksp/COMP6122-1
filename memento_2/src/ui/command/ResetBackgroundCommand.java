package ui.command;

import java.awt.Color;

import ui.CellPanel;

public class ResetBackgroundCommand extends CellCommand {
	private Color before;

	public ResetBackgroundCommand(CellPanel receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		before = receiver.getCurrentColor();
		this.receiver.resetBackground();
		snapshot();
	}

	@Override
	public void rollback() {
		this.receiver.setBackground(before);
	}

	@Override
	protected CellCommand clone() {
		ResetBackgroundCommand c = new ResetBackgroundCommand(receiver);
		c.before = this.before;

		return c;
	}
}
