//This class implements the Controller layer of the MVC. 

package com.capgemini.ems.controller;

import java.util.Set;

import com.capgemini.ems.employee.Employee;
import com.capgemini.ems.servicelayer.EmployeeServiceLayer;

public class AppController {
	
	//Reference variable of class to which Controller will interact with.
	EmployeeServiceLayer employeeServiceLayer;

	
	//Setters method for creating the object of EmployeeServiceLayer.
	public void setEmployeeServiceLayer(EmployeeServiceLayer employeeServiceLayer) {
		this.employeeServiceLayer = employeeServiceLayer;
	}

	
	//Services for which controller can ask for.
	
	public void addEmployee(Employee employee) {
		employeeServiceLayer.addEmployee(employee);
	}

	public static Set<Employee> viewAllEmployee() {
		return EmployeeServiceLayer.viewAllEmployee();
	}

	public Employee getEmployeeByID(int ID) {
		return employeeServiceLayer.getEmployeeByID(ID);
	}

	public void deleteEmployeeBYID(int ID) {
		employeeServiceLayer.deleteEmployeeBYID(ID);
	}
}
