//This class has various instance members of the employee.
//This class also has the getters and setters for the instance members.

package com.capgemini.ems.employee;

public class Employee implements Comparable<Employee>{
	private final  int id;
	private String name;
	private double salary;
	
	private static int counter=200;
	
	{
		id = ++counter;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee arg0) {
		return this.getId()-arg0.getId();
	}
	
}
