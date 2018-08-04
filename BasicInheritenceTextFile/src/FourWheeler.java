//Class inheriting Vehicle class and overriding the Start()

public class FourWheeler extends Vehicle {

	@Override
	// Overridden Method having the print statement to ensure the execution of the
	// method
	public void start() {
		System.out.println("Start() of FourWheeler initiated....");
	}

}
