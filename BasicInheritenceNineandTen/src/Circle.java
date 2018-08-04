// class inheriting Shape and overriding draw method

public class Circle extends Shape {

	@Override
	// Abstract method overridden by Circle class.
	//This method returns a message just to show if it is executed.
	public String draw() {
		String message = "Circle Drawn";
		return message;
	}

}
