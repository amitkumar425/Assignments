//this Class maintains the list of all the assignments.

package com.capgemin.datetimeapi;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

import com.capgemini.datetimeapi.exception.AssignmentNotCompleteException;

public class AssignmentList {

	private Set<Assignment> listOfAssignment;

	public AssignmentList() {
		listOfAssignment = new TreeSet<Assignment>();
	}

	// Adds the assignment to the listOfAssignment.
	public void addAssignment(Assignment assignment) {
		listOfAssignment.add(assignment);
	}

	// This method removes the assignment from the list only if the status is
	// completed.
	public void removeAssignment(Assignment assignment) throws AssignmentNotCompleteException {
		if (assignment.isIscompleted()) {
			listOfAssignment.remove(assignment);
		} else {
			throw new AssignmentNotCompleteException("Assignment is Not completed yet");
		}
	}

	// This method returns the assignmentList.
	public Set<Assignment> getListOfAllAssignment() {
		return listOfAssignment;
	}

	// This method returns the duedate of the assignment having the earliest due
	// date.
	public LocalDate getEarliestAssignment() {
		LocalDate earliestDueDate = LocalDate.now().minusYears(-20);
		for (Assignment assignment : listOfAssignment) {
			if (assignment.getDueDate().isBefore(earliestDueDate)) {
				earliestDueDate = assignment.getDueDate();
			}
		}
		return earliestDueDate;
	}
}
