//Driver class checking the correctness of Child,ParentOne class and ParentTwo interface

public class ParentTester {

	public static void main(String[] args) {

		// creating the object of concrete class
		Child ch = new Child();

		// Accessing the instance member of the interface directly using the name of the
		// interface followed by the variable name
		System.out.println(ParentTwo.i);

		// calling the method of the created object
		ch.disp();
	}

}
