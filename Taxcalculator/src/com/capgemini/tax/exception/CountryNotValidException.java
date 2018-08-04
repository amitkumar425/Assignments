//This is an CountryNotValidException extending the Exception class, containing the overridden toString() method 
//to display the type of Exception

package com.capgemini.tax.exception;

public class CountryNotValidException extends Exception{

	@Override
	public String toString() {
		return "The Employee should be an indian Citizen for calculating tax";
	}

	
}
