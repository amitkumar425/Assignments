//Class implementing the properties of rectangle. 

public class Rectangle {

	// Instance Variable of the class
	private double length;
	private double breadth;

	// parameterized constructor
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}

	// Method to calculating the area of the rectangle
	public double area() {
		return length * breadth;
	}

	// Method to calculating the perimeter of the rectangle
	public double perimeter() {
		return 4 * (length + breadth);
	}

	// Class method to compare area of the given two rectangle
	public static int compareArea(Rectangle rectangleOne, Rectangle rectangleTwo) {
		if (rectangleOne.area() == rectangleTwo.area()) {
			return 0;
		}
		if (rectangleOne.area() > rectangleTwo.area()) {
			return 1;
		}
		if (rectangleOne.area() < rectangleTwo.area()) {
			return 2;
		}
		return -1;
	}
}
