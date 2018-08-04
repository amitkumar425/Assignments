//This class implements the service layer of the MVC.

package com.capgemini.ems.servicelayer;

import java.util.Set;



import com.capgemini.ems.datalayer.EmployeeDAO;
import com.capgemini.ems.employee.Employee;

public class EmployeeServiceLayer {
	EmployeeDAO employeeDAO;
	
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	//These are the methods provided by the Data Layer.
	public void addEmployee(Employee employee) {
		employeeDAO.addEmployee(employee);
	}

	public static Set<Employee> viewAllEmployee() {
		return EmployeeDAO.viewAllEmployee();
	}

	public Employee getEmployeeByID(int ID) {
		return employeeDAO.getEmployeeByID(ID);
	}

	public void deleteEmployeeBYID(int ID) {
		employeeDAO.deleteEmployeeBYID(ID);
	}
	
}
