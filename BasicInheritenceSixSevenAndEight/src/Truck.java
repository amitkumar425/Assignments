//Class inheriting Vehicle.java and overriding its personRequiredToDriveSaftely() and also overloading it

public class Truck extends Vehicle {

	public Truck(int numberOfWheels, boolean smartDesign, boolean easyToDriveFeatureIncluded, String typeOfVehicle) {
		super(numberOfWheels, smartDesign, easyToDriveFeatureIncluded, typeOfVehicle);
	}

	@Override
	public int personRequiredToDriveSaftely() {
		if (getTypeOfVehicle().equals("Heavy")) {
			return 2;
		} else {
			return 1;
		}
	}

	// Overloaded method to check if the vehicle falls into category of car or truck
	public int personRequiredToDriveSaftely(int numberOfPerson) {
		if (getTypeOfVehicle().equals("Heavy") && numberOfPerson > 2) {
			return 2;
		} else {
			return 1;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Truck [personRequiredToDriveSaftely()=" + personRequiredToDriveSaftely() + ", getNumberOfWheels()="
				+ getNumberOfWheels() + ", isSmartDesign()=" + isSmartDesign() + ", isEasyToDriveFeatureIncluded()="
				+ isEasyToDriveFeatureIncluded() + ", getTypeOfVehicle()=" + getTypeOfVehicle() + ", toString()="
				+ super.toString() + "]";
	}

}
