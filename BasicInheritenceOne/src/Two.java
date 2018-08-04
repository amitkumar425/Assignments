//Driver Class to illustrate the constructor invocation. 
//It creates the objects of both the class and calls the methods of respective class
public class Two {

	public static void main(String[] args) {

		// creating first object
		First first = new First("FIRST", 100);

		// getting Class value
		System.out.println(first.getClassValue());

		// setting class value
		first.setClassValue(130);

		// creating second object
		Second second = new Second("SECOND", 200);

		// getting Class value
		System.out.println(second.getClassValue());

		// setting class value
		second.setClassValue(130);

		// Printing the Object's information by invoking the toString()
		System.out.println(first);
		System.out.println(second);

	}

}
