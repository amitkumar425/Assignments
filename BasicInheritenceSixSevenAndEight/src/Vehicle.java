// Parent class for car.java and Truck.java implementing the common behavior and properties

public abstract class Vehicle {
	private int numberOfWheels;
	private boolean smartDesign;
	private boolean easyToDriveFeatureIncluded;
	private String typeOfVehicle;

	/**
	 * @param numberOfWheels
	 * @param smartDesign
	 * @param easyToDriveFeatureIncluded
	 * @param typeOfVehicle
	 */
	public Vehicle(int numberOfWheels, boolean smartDesign, boolean easyToDriveFeatureIncluded, String typeOfVehicle) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.smartDesign = smartDesign;
		this.easyToDriveFeatureIncluded = easyToDriveFeatureIncluded;
		this.typeOfVehicle = typeOfVehicle;
	}

	public abstract int personRequiredToDriveSaftely();

	/**
	 * @return the numberOfWheels
	 */
	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	/**
	 * @param numberOfWheels the numberOfWheels to set
	 */
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	/**
	 * @return the smartDesign
	 */
	public boolean isSmartDesign() {
		return smartDesign;
	}

	/**
	 * @param smartDesign the smartDesign to set
	 */
	public void setSmartDesign(boolean smartDesign) {
		this.smartDesign = smartDesign;
	}

	/**
	 * @return the easyToDriveFeatureIncluded
	 */
	public boolean isEasyToDriveFeatureIncluded() {
		return easyToDriveFeatureIncluded;
	}

	/**
	 * @param easyToDriveFeatureIncluded the easyToDriveFeatureIncluded to set
	 */
	public void setEasyToDriveFeatureIncluded(boolean easyToDriveFeatureIncluded) {
		this.easyToDriveFeatureIncluded = easyToDriveFeatureIncluded;
	}

	/**
	 * @return the typeOfVehicle
	 */
	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	/**
	 * @param typeOfVehicle the typeOfVehicle to set
	 */
	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [numberOfWheels=" + numberOfWheels + ", smartDesign=" + smartDesign
				+ ", easyToDriveFeatureIncluded=" + easyToDriveFeatureIncluded + ", typeOfVehicle=" + typeOfVehicle
				+ ", personRequiredToDriveSaftely()=" + personRequiredToDriveSaftely() + ", getNumberOfWheels()="
				+ getNumberOfWheels() + ", isSmartDesign()=" + isSmartDesign() + ", isEasyToDriveFeatureIncluded()="
				+ isEasyToDriveFeatureIncluded() + ", getTypeOfVehicle()=" + getTypeOfVehicle() + "]";
	}

}
