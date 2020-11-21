package main;

import widget.MotifWidgetFactory;
import widget.PMWidgetFactory;
import widget.WidgetFactory;
import widget.component.scrollbar.ScrollBar;
import widget.component.window.Window;

public class Main {
	public Main() {
		// kita bisa melakukan dependency injection ke fungsi foo
		// fungsi foo dapat menerima semua jenis WidgetFactory
		foo(new MotifWidgetFactory());
		foo(new PMWidgetFactory());
	}

	public static void main(String[] args) {
		new Main();
	}

	private void foo(WidgetFactory factory) {
		ScrollBar sb = factory.createScrollBar();
		Window w = factory.createWindow();

		System.out.println(sb.getClass().getName());
		System.out.println(w.getClass().getName());
		System.out.println("");
	}
}
