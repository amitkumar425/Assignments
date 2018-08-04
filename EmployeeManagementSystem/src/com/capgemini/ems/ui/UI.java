//This class provides the userInteface for the user.


package com.capgemini.ems.ui;

import java.util.Scanner;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.ems.controller.AppController;
import com.capgemini.ems.employee.Employee;

public class UI {
	
	public static void startUI() {
		Employee employee;
		Scanner scanner = new Scanner(System.in);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Employee.xml");
		AppController appController =(AppController) context.getBean("appController");
		
		while(true) {
			
			//List Of options Available.
			System.out.println("Enter Your Option");
			System.out.println("1.Input Data");
			System.out.println("2.Display Data");
			System.out.println("3.Search Employee By ID");
			System.out.println("4.Delete Employee By ID");
			System.out.println("5.Exit");
			
			//Taking the input from the user.
			scanner = new Scanner(System.in);
			int option = scanner.nextInt();
			
			//Switching to the given case.
			switch (option) {
			case 1: employee = new Employee();
					System.out.println("Enter your Name");
					employee.setName(scanner.next());
					System.out.println("Enter your Salary");
					employee.setSalary(scanner.nextDouble());
					appController.addEmployee(employee);
				break;
				
			case 2:Set<Employee> listOfEmployee = AppController.viewAllEmployee();
					listOfEmployee.stream().forEach(System.out::println);
				break;
				
			case 3: System.out.println("Enter the ID");
					System.out.println(appController.getEmployeeByID(scanner.nextInt()));
				break;
				
			case 4: System.out.println("Enter the ID to be Deleted");
			        appController.deleteEmployeeBYID(scanner.nextInt());
			    break;
			case 5:java.lang.System.exit(0);
				break;
			default: System.out.println("Enter the correct Option !!!");
				break;
			}
		}
	}
	
}
