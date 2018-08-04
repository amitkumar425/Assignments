////Exception class to handle the situation of invalid token for accessing the parked car 

package com.capgemini.parking.exception;

public class InvalidTokenException extends Exception {

	public InvalidTokenException(String exception) {
		super(exception);
	}

}
