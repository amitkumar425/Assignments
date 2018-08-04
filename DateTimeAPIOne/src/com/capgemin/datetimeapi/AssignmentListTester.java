//This class implements and verifies the working of Assignment.java and AssignmentList.java . 

package com.capgemin.datetimeapi;

import java.time.LocalDate;
import java.util.Set;

import com.capgemini.datetimeapi.exception.AssignmentNotCompleteException;

public class AssignmentListTester {

	public static void main(String[] args) {

		// Creating two object of assignment.
		Assignment assignmentTwo = new Assignment(false, LocalDate.now(), LocalDate.now().minusMonths(-4));
		Assignment assignmentOne = new Assignment(false, LocalDate.now().minusDays(4),
				LocalDate.now().minusDays(-4).minusMonths(-4));

		// Creating the object of AssignmentList in which assignment will be added.
		AssignmentList listOfAssignment = new AssignmentList();

		// Adding the Assignment objects to the Assignmentlist.
		listOfAssignment.addAssignment(assignmentTwo);
		listOfAssignment.addAssignment(assignmentOne);

		// Getting the list of all the Assignment.
		Set<Assignment> set = listOfAssignment.getListOfAllAssignment();

		// Changing the status of assignmentOne to true.
		assignmentOne.setIscompleted(true);

		// Trying to removing one assignment from the listOfAssignment.
		try {
			listOfAssignment.removeAssignment(assignmentOne);
		} catch (AssignmentNotCompleteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Displaying the assignment
		set.stream().forEach(System.out::println);

		// Listing the Assignment with the earliest due date.
		System.out.println("The Assignment with the Earliest Due date has DueDate as :-  "
				+ listOfAssignment.getEarliestAssignment());

	}

}
