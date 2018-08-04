// class inheriting Shape and overriding draw method

public class Polygon extends Shape {

	@Override
	// Abstract method overridden by Polygon class.
	//This method returns a message just to show if it is executed.
	public String draw() {
		String message = "Ploygon Drawn";
		return message;
	}

}
