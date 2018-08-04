
//This is an EmployeeNameInvalidException extending the Exception class, containing the overridden toString() method 
//to display the type of Exception

package com.capgemini.tax.exception;

public class EmployeeNameInvalidException extends Exception {

	@Override
	public String toString() {
		return "Employee name cannot be empty";
	}

}
