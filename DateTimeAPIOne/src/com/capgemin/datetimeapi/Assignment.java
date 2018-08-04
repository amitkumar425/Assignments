//This class has the instance members associated with the assignment 

package com.capgemin.datetimeapi;

import java.time.LocalDate;

public class Assignment implements Comparable<Assignment> {
	private boolean iscompleted;
	private LocalDate assignedDate;
	private LocalDate dueDate;

	/**
	 * @param isompleted
	 * @param assignedDate
	 * @param dueDate
	 */
	public Assignment(boolean iscompleted, LocalDate assignedDate, LocalDate dueDate) {
		this.iscompleted = iscompleted;
		this.assignedDate = assignedDate;
		this.dueDate = dueDate;
	}

	// Getters method
	public boolean isIscompleted() {
		return iscompleted;
	}

	public LocalDate getAssignedDate() {
		return assignedDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	// Setter to change the status of the assignment.
	public void setIscompleted(boolean iscompleted) {
		this.iscompleted = iscompleted;
	}

	@Override
	public String toString() {
		return "Assignment [iscompleted=" + iscompleted + ", assignedDate=" + assignedDate + ", dueDate=" + dueDate
				+ "]";
	}

	@Override
	public int compareTo(Assignment arg0) {
		return this.getAssignedDate().compareTo(arg0.getAssignedDate());
	}
}
