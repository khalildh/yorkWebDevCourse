abstract class TwoDShape {
	private double width, height;

	TwoDShape() {
		width = height = 0;
	}

	TwoDShape(double i, double j) {
		width = i;
		height = j;
	}

	void setWidth(double x) {
		width = x;
	}

	double getWidth() {
		return width;
	}

	void setHeight(double x) {
		height = x;
	}

	double getHeight() {
		return height;
	}

	abstract double area();

}

class Triangle extends TwoDShape {

	Triangle(double i, double j) {
		super(i, j);
	}

	double area(){
		return getWidth() * getHeight() * .5;
	}
}

class Rectangle extends TwoDShape {

	Rectangle(double i, double j) {
		super(i, j);
	}

	double area() {
		return getHeight() * getWidth();
	}

}


class AbsShape {
	public static void main(String[] args) {
		TwoDShape ob;
		ob = new Triangle(2, 3);
		System.out.println(ob.area());
		ob = new Rectangle(2,4);
		System.out.println(ob.area());
	}
}