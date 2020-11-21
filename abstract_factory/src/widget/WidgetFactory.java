package widget;

import widget.component.scrollbar.ScrollBar;
import widget.component.window.Window;

public abstract class WidgetFactory {
	public abstract ScrollBar createScrollBar();

	public abstract Window createWindow();
}