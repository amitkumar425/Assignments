//Driver class for implementing TwoWheeler,ThreeWheelerand FourWheeler classes.
//It creates the array of interface called Vehicle and assigns the objects of all the above said
//classes to it.
//This class calls the start method of ThreeWheeler class' object by traversing the array
public class VDemo {

	public static void main(String[] args) {
		Vehicle[] vehicle = new Vehicle[3];
		vehicle[0] = new TwoWheeler();
		vehicle[1] = new ThreeWheeler();
		vehicle[2] = new FourWheeler();

		// traversing the array of objects
		for (int i = 0; i < 3; i++) {
			if (vehicle[i].getClass().getSimpleName().equals("ThreeWheeler")) { // Condition for checking if the object
																				// is of class ThreeWheeler or not
				vehicle[i].start();
			}
		}
	}

}
