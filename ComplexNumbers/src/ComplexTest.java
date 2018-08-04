//Driver class for performing the operation on complex numbers. 

import java.util.Scanner;

public class ComplexTest {

	public static void main(String[] args) {
		
		//Creating three complex object.
		Complex complexNumberOne = new Complex();
		Complex complexNumberTwo = new Complex();
		Complex complexNumberThree = new Complex();
		
		Scanner scanner = new Scanner(System.in);
		
		//Taking two complex number as inputs 
		System.out.println("Enter the First Complex number");
		complexNumberOne.set(scanner.nextDouble() , scanner.nextDouble());
		System.out.println("Enter the second Complex number");
		complexNumberTwo.set(scanner.nextDouble() , scanner.nextDouble());
		
		//Assigning sum of two to third complex number
		complexNumberThree =  Complex.sum(complexNumberOne, complexNumberTwo);
		
		//printing all the complex numbers
		System.out.println("First Complex Number = "+complexNumberOne.disp());
		System.out.println("Second Complex Number = "+complexNumberTwo.disp());
		System.out.println("Third Complex Number = "+complexNumberThree.disp());
	}

}
