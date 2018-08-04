
//Driver class of Rectangle.java

import java.util.Scanner;

public class DriverOfRectangle {

	public static void main(String[] args) {

		// Creates the object of scanner class
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the length and breadth of the 1st rectangle");

		// Accepts the length and breadth of the rectangle and creates its object
		Rectangle rectangleOne = new Rectangle(scanner.nextDouble(), scanner.nextDouble());

		// printing the Area and perimeter for the first rectangle
		System.out.println(
				"For the First Rectangle\nArea = " + rectangleOne.area() + "\nPerimeter = " + rectangleOne.perimeter());

		// Asking for another rectangle
		System.out.println("Do you Have another Rectangle to compare?( Enter 1->Yes and 0->No)");
		int counter = scanner.nextInt();

		// taking the value for the second rectangle
		if (counter == 1) {
			System.out.println("Enter the length and breadth of the 2nd rectangle");

			// creation of Second rectangle
			Rectangle rectangleTwo = new Rectangle(scanner.nextDouble(), scanner.nextDouble());

			// printing the Area and perimeter for the Second rectangle
			System.out.println("For the Second Rectangle\nArea = " + rectangleTwo.area() + "\nPerimeter = "
					+ rectangleTwo.perimeter());

			// Calling the comparator() using the class name and passing the rectangles
			// object whose area is to be compared.
			int comparator = Rectangle.compareArea(rectangleOne, rectangleTwo);

			// Printing the rectangle with the greater area
			if (comparator == 0) {
				System.out.println("Both The rectangles have same area");
			}
			if (comparator == 1) {
				System.out.println("1st Rectangle has greater area than 2nd");
			}
			if (comparator == 2) {
				System.out.println("2nd Rectangle has greater area than 1st");
			}
		} else {
			java.lang.System.exit(0);
		}
	}
}
