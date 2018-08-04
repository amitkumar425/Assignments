//This is the Driver class implementing the EmployeeInformation.java and MMSavingAccount.java.
//This class maintains a dataStructure called HashMap with Key=object of EmployeeInformation and 
//value= object of MMSavingAccount.

package com.capgemini.advancecollection.mmbank;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMMBankTester {

	public static void main(String[] args) {

		// Creating the object of HashMAp.
		Map<EmployeeInformation, MMSavingAccount> mapOfEmployeeToSalary = new HashMap<>();

		// Creating the key and value to be inserted into the map.
		EmployeeInformation employeeOne = new EmployeeInformation(2045, "Amit Kumar", "Software Engineer", 10_439);
		MMSavingAccount savingAccountOfemployeeOne = new MMSavingAccount(5006003, employeeOne.getEmployeeName(), 56000,
				true);

		EmployeeInformation employeeTwo = new EmployeeInformation(2045, "Alfez Ullah", "Software Engineer", 10_439);
		MMSavingAccount savingAccountOfemployeeTwo = new MMSavingAccount(5006003, employeeTwo.getEmployeeName(), 56000,
				true);

		// Adding the created key and value to the map.
		mapOfEmployeeToSalary.put(employeeOne, savingAccountOfemployeeOne);
		mapOfEmployeeToSalary.put(employeeTwo, savingAccountOfemployeeTwo);

		// Printing the Saving accountDetails of employeeOne
		System.out.println("Saving account of personOne = " + mapOfEmployeeToSalary.get(employeeOne));

		// Printing the entire map by implementing forEach() which implements BiConsumer
		// functional interface.
		mapOfEmployeeToSalary.forEach((emp, savacc) -> System.out.println(emp + "\n" + savacc));

	}

}
