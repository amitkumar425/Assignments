//Class inheriting Vehicle.java and overriding its personRequiredToDriveSaftely()

public class Car extends Vehicle {
	private boolean lockingSystem;

	/**
	 * @param numberOfWheels
	 * @param smartDesign
	 * @param easyToDriveFeatureIncluded
	 * @param typeOfVehicle
	 */
	public Car(int numberOfWheels, boolean smartDesign, boolean easyToDriveFeatureIncluded, String typeOfVehicle,
			boolean lockingSystem) {
		super(numberOfWheels, smartDesign, easyToDriveFeatureIncluded, typeOfVehicle);
		this.lockingSystem = lockingSystem;
	}

	@Override
	public int personRequiredToDriveSaftely() {
		if (getTypeOfVehicle().equals("Light") && lockingSystem == true) {
			return 1;
		} else {
			return 2;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [lockingSystem=" + lockingSystem + ", personRequiredToDriveSaftely()="
				+ personRequiredToDriveSaftely() + "]" + super.toString();
	}

}
