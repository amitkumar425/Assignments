//This is an TaxNotEligibleException extending the Exception class, containing the overridden toString() method 
//to display the type of Exception

package com.capgemini.tax.exception;

public class TaxNotEligibleException extends Exception {

	@Override
	public String toString() {
		return "The Employee does not need to pay tax";
	}

}
