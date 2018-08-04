//Class implementing various properties of vehicle

public class Vehicle {
	public boolean TURN_LEFT=false,TURN_RIGHT=false;
	private int currentSpeed;
	private double currentDirection;
	private String ownerName;
	private static int highestVehicleIdentificationNumber;
	private  String vehicleID;
	
	//No-Arg constructor
	public Vehicle() {
		highestVehicleIdentificationNumber+=1;
		vehicleID = "ABC"+highestVehicleIdentificationNumber;
	}
	
	//Argumented constructor
	public Vehicle(String ownerName) {
		this();
		this.ownerName = ownerName;
	}
	
	//Setters method for direction
	public void setCurrentDirection(double currentDirection) {
		this.currentDirection = currentDirection;
	}
	
	
	//getters method for all the field value
	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public double getCurrentDirection() {
		return currentDirection;
	}

	public String getOwnerName() {
		return ownerName;
	}
	
	//method  to know the getHighestVehicleIdentificationNumber
	public static int getHighestVehicleIdentificationNumber() {
		return highestVehicleIdentificationNumber;
	}

	//method  to know the vehicleID
	public  String getVehicleID() {
		return vehicleID;
	}

	//Method to change with the given degree
	public void turn(double degreeOfTurn){
		currentDirection+=degreeOfTurn;
	}

	//method to change the direction to right
	public void turnLeft(){
		TURN_LEFT=true;
		TURN_RIGHT=false;
	}
	
	//method to change the direction to right
	public void turnRight(){
		TURN_RIGHT=true;
		TURN_LEFT=false;
	}
	
	//Method that changes the speed to desired speed
	public void changeSpeed(int finalSpeed) {
		currentSpeed=finalSpeed;
	}
	
	//Method that stops the Engine
	public void stop() {
		currentSpeed=0;
	}
	
	@Override
	public String toString() {
		return "Vehicle [TURN_LEFT=" + TURN_LEFT + ", TURN_RIGHT=" + TURN_RIGHT + ", currentSpeed=" + currentSpeed
				+ ", currentDirection=" + currentDirection + ", ownerName=" + ownerName + ", vehicleID=" + vehicleID
				+ ", getCurrentSpeed()=" + getCurrentSpeed() + ", getCurrentDirection()=" + getCurrentDirection()
				+ ", getOwnerName()=" + getOwnerName() + ", getVehicleID()=" + getVehicleID() +",getHighestVehicleIdentificationNumber()="+getHighestVehicleIdentificationNumber()+ "]";
	}
	
	
	
	
}
