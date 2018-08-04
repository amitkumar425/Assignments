//This class contains the instance members and the related setters and getters 
//to access the values of the instance members.

package com.capgemini.advancecollection.mmbank;

public class EmployeeInformation {
	private int employeeID;
	private String employeeName;
	private String employeeDesignation;
	private double employeeSalary;

	/**
	 * @param employeeID
	 * @param employeeName
	 * @param employeeDesignation
	 * @param employeeSalary
	 */
	public EmployeeInformation(int employeeID, String employeeName, String employeeDesignation, double employeeSalary) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;

	}

	// Getters methods for the instance members.
	public int getEmployeeID() {
		return employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	// Setters method for the instance members.
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "EmployeeInformation [getEmployeeID()=" + getEmployeeID() + ", getEmployeeName()=" + getEmployeeName()
				+ ", getEmployeeDesignation()=" + getEmployeeDesignation() + ", getEmployeeSalary()="
				+ getEmployeeSalary() + "]";
	}

}
