//This class extends the Exception and handles the exception when it is not completed and the 
//user is trying to remove it from the list of Assignments.

package com.capgemini.datetimeapi.exception;

public class AssignmentNotCompleteException extends Exception {

	public AssignmentNotCompleteException(String message) {
		super(message);
	}

}
