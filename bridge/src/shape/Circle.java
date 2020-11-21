package shape;

public class Circle extends Shape {
	public Circle(Color color) {
		super(color);
	}

	@Override
	public void display() {
		System.out.println(color.getColor() + " circle");
	}
}