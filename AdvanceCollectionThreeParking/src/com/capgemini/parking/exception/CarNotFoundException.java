//Exception class to handle the situation of illegal car access.
package com.capgemini.parking.exception;

public class CarNotFoundException extends Exception {

	public CarNotFoundException(String exception) {
		super(exception);
	}
}
