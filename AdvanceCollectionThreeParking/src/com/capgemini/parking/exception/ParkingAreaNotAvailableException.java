//Exception class to handle the shortage of resource for parking
package com.capgemini.parking.exception;

public class ParkingAreaNotAvailableException extends Exception {

	public ParkingAreaNotAvailableException(String exception) {
		super(exception);
	}

}
