//Driver class for testing the working of Employee.java

public class EmployeeTest {

	public static void main(String[] args) {
		//Creating the objects of the Employee class and calling its toString() for the details  
		Employee employee = new Employee("Amit", 9573);
		System.out.println(employee);

		Employee employeeTwo = new Employee("Kumar", 9000);
		System.out.println(employeeTwo);
	}

}
