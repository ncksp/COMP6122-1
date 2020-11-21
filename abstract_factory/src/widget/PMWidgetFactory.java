package widget;

import widget.component.scrollbar.PMScrollBar;
import widget.component.scrollbar.ScrollBar;
import widget.component.window.PMWindow;
import widget.component.window.Window;

public class PMWidgetFactory extends WidgetFactory {
	@Override
	public ScrollBar createScrollBar() {
		return new PMScrollBar();
	}

	@Override
	public Window createWindow() {
		return new PMWindow();
	}
}