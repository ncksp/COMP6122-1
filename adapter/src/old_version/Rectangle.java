package old_version;

public class Rectangle {
	public void display(int x, int y, int w, int h) {
		// ... drawing rectangle from point (x,y) to (x+w,y+h)
		System.out.print("drawing rectangle from ");
		System.out.print(x + "," + y);
		System.out.print(" to ");
		System.out.println((x + w) + "," + (y + h));
	}
}