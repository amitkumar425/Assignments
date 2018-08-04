// class inheriting Shape and overriding draw method

public class Rectangle extends Shape {

	@Override
	// Abstract method overridden by Rectangle class.
	//This method returns a message just to show if it is executed.
	public String draw() {
		String message = "Rectangle Drawn";
		return message;
	}

}
