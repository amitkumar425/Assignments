//Driver Class implementing the class called Vehicle.java

public class VehicleTester {

	public static void main(String[] args) {
		//Creating first object with no-arg constructor and displaying its properties 
		Vehicle firstVehicle = new Vehicle();
		System.out.println(firstVehicle);
		
		//changing properties of the first object
		firstVehicle.changeSpeed(80);
		
		//creating second object with parameterized constructor
		Vehicle secondVehicle = new Vehicle("Amit");
		System.out.println(secondVehicle);

		//changing the properties of the second and first object
		secondVehicle.changeSpeed(180);
		firstVehicle.setCurrentDirection(40);
		secondVehicle.setCurrentDirection(50);
		
		firstVehicle.stop();//stoping the second vehicle	
		System.out.println("After Applying brake on firstVehicle");
		
		//printing the information via toString() of both the objects
		System.out.println(firstVehicle);
		System.out.println(secondVehicle);

	}

}
