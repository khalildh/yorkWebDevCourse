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

	TwoDShape() {
		width = 0;
		height= 0;
	}

	TwoDShape(double x, double y) {
		width = x;
		height = y;
	}
	
}

class Triangle extends TwoDShape {
	String style;

	Triangle() {
		super();
		style = "no style";
	}

	Triangle(double x, double y, String z) {
		super(x, y);
		style = z;

	}

	double area() {
		return getWidth() * getHeight() * .5;
	}

	void showStyle() {
		System.out.println("The style is " + style);
	}

	

}

class Rectangle extends TwoDShape {

	Rectangle() {
		super();
	}

	Rectangle(double x, double y) {

		super(x, y);
	}

	boolean isSquare() {

		if(getWidth() == 0) {
			return false;
		}

		else if (getWidth() == getHeight()) {
			return true;
		}

		return false;
	}


	double area() {
		return getWidth() * getHeight();
	}
	
}


class Shapes3 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(10, 13.5, "filled");

		t1.showDim();
		t1.showStyle();
		System.out.println(t1.area());

		TwoDShape twoD = new TwoDShape(5, 4);
		twoD.showDim();

		Rectangle r1 = new Rectangle(5, 5);
		System.out.println(r1.isSquare());
		System.out.println(r1.area());
	}
}