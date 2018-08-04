//This class has the instance members to store the information about the Car Owner. 

package com.capgemini.parking;

public class ParkedCarOwnerDetails {
	public static int checkingObject = -1;// Instance member for checking the vacancy of an
											// array slot.
	private String ownerName;
	private String carModdel;
	private String carNO;
	private long ownerMobileNumber;
	private String ownerAddress;

	/**
	 * @param ownerName
	 * @param carModdel
	 * @param carNO
	 * @param ownerMobileNumber
	 * @param ownerAddress
	 */
	public ParkedCarOwnerDetails(String ownerName, String carModdel, String carNO, long ownerMobileNumber,
			String ownerAddress) {
		this.ownerName = ownerName;
		this.carModdel = carModdel;
		this.carNO = carNO;
		this.ownerMobileNumber = ownerMobileNumber;
		this.ownerAddress = ownerAddress;
	}

	// Getters for the above instance members
	public String getOwnerName() {
		return ownerName;
	}

	public String getCarModdel() {
		return carModdel;
	}

	public String getCarNO() {
		return carNO;
	}

	public long getOwnerMobileNumber() {
		return ownerMobileNumber;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

}
