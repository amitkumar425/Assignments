//This class has the actual implementation of all the services provide by the service layer.

package com.capgemini.ems.datalayer;

import java.util.Set;
import java.util.TreeSet;

import com.capgemini.ems.employee.Employee;

public class EmployeeDAO {
	
	//Set to store the data of the employee.
	private static Set<Employee> setOfEmployee;

	//Block that is executed only once when the class is loaded.
	static {
		setOfEmployee = new TreeSet<Employee>();
	}

	//method to add the employee into the set.
	public void addEmployee(Employee employee) {
		setOfEmployee.add(employee);
	}

	//method to view all the list of added employee.
	public static Set<Employee> viewAllEmployee() {
		return setOfEmployee;
	}

	//Returning the employee given the employee ID.
	public Employee getEmployeeByID(int ID) {
		for (Employee e : setOfEmployee) {
			if (e.getId() == ID) {
				return e;
			}
		}
		return null;
	}


	//Deleting the employee given the employee ID.
	public void deleteEmployeeBYID(int ID) {
		for (Employee e : setOfEmployee) {
			if (e.getId() == ID) {
				setOfEmployee.remove(e);
				break;
			}
		}

	}
}
