package widget;

import widget.component.scrollbar.MotifScrollBar;
import widget.component.scrollbar.ScrollBar;
import widget.component.window.MotifWindow;
import widget.component.window.Window;

public class MotifWidgetFactory extends WidgetFactory {
	@Override
	public ScrollBar createScrollBar() {
		return new MotifScrollBar();
	}

	@Override
	public Window createWindow() {
		return new MotifWindow();
	}
}