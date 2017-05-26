class TwoDShape {
	private double width;
	private double height;

	public double getWidth() {
		return width;
	}

	public void setWidth(double x) {
		width = x;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double x) {
		height = x;
	}

	void showDim() {
		System.out.println("Width " + width + ", Height: " + height);
	}

	// TwoDShape(double x, double y) {
	// 	width = x;
	// 	height = y;
	// }
	
}

class Triangle extends TwoDShape {
	String style;

	double area() {
		return getWidth() * getHeight() * .5;
	}

	void showStyle() {
		System.out.println("The style is " + style);
	}

	Triangle(double x, double y) {
		setWidth(x);
		setHeight(y);
	}

}

class Rectangle extends TwoDShape {

	boolean isSquare() {
		if (getWidth() == getHeight()) {
			return true;
		}

		return false;
	}

	Rectangle(double x, double y) {
		setWidth(x);
		setHeight(y);
	}

	double area() {
		return getWidth() * getHeight();
	}
	
}


class Shapes2 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0, 13.5);
		t1.style = "filled";

		t1.showDim();
		t1.showStyle();
		System.out.println(t1.area());

		TwoDShape twoD = new TwoDShape();
		twoD.setWidth(5);
		twoD.setHeight(4);
		twoD.showDim();

		Rectangle r1 = new Rectangle(5, 5);
		System.out.println(r1.isSquare());
		System.out.println(r1.area());
	}
}