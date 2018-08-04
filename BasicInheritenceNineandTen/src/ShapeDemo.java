//Driver class Testing the polygon,rectangle,circle and shape class 

public class ShapeDemo {

	public static void main(String[] args) {
		// Creating the reference of Parent class and assigning object of Circle to it
		Shape shape = new Circle();

		// Calling darw() of circle
		System.out.println(shape.draw());

		// assigning the object of Rectangle() to shape reference
		shape = new Rectangle();

		// Calling draw() of rectangle
		System.out.println(shape.draw());

		// assigning the object of Polygon() to shape reference
		shape = new Polygon();

		// Calling draw() of polygon
		System.out.println(shape.draw());

		// Question Number :- 10
		// Creating an array of references of Shape class
		Shape[] arrayOfShape = new Shape[3];

		// Creating Instance of Circle and Storing into the array reference of shape
		arrayOfShape[0] = new Circle();
		// Calling draw() of circle
		System.out.println(arrayOfShape[0].draw());

		// Creating Instance of Rectangle and Storing into the array reference of shape
		arrayOfShape[1] = new Rectangle();
		// Calling draw() of rectangle
		System.out.println(arrayOfShape[1].draw());

		// Creating Instance of polygon and Storing into the array reference of shape
		arrayOfShape[2] = new Polygon();
		// Calling draw() of polygon
		System.out.println(arrayOfShape[2].draw());
	}

}
