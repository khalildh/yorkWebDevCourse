class TwoDShape {
	double width;
	double height;

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
		return width * height * .5;
	}

	void showStyle() {
		System.out.println("The style is " + style);
	}

	Triangle(double x, double y) {
		width = x;
		height = y;
	}

}

class Rectangle extends TwoDShape {

	boolean isSquare() {
		if (width == height) {
			return true;
		}

		return false;
	}

	Rectangle(double x, double y) {
		width = x;
		height = y;
	}

	double area() {
		return width * height;
	}
	
}


class Shapes {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0, 13.5);
		t1.style = "filled";

		t1.showDim();
		t1.showStyle();
		System.out.println(t1.area());

		TwoDShape twoD = new TwoDShape();
		twoD.width = 5;
		twoD.height = 4;
		twoD.showDim();

		Rectangle r1 = new Rectangle(5, 5);
		System.out.println(r1.isSquare());
		System.out.println(r1.area());
	}
}