//Main class for testing Truck.java and Car.java

public class VehicleTester {

	public static void main(String[] args) {
		Truck truckObject = new Truck(10, false, false, "Heavy");

		// calling the method without any arg to display the number of men required to
		// drive
		System.out.println("Person Required to drive Truck Saftely = " + truckObject.personRequiredToDriveSaftely());

		// calling the parameterized overloaded method to check if the given number is
		// sufficient or not
		System.out.println("The provided number is not correct. Correct NUmber Should be = "
				+ truckObject.personRequiredToDriveSaftely(7));

		// Creating the Car object
		Car carObject = new Car(4, true, true, "Light", true);

		// calling the method without any arg to display the number of men required to
		// drive
		System.out.println("Person Required to drive Car Saftely = " + truckObject.personRequiredToDriveSaftely());

		// calling toString method of both the objects

		System.out.println(truckObject);
		System.out.println(carObject);
	}

}
