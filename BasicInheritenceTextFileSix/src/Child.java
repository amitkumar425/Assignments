//Concrete class inheriting abstract class called ParentOne and implementing interface ParentTwo

public class Child extends ParentOne implements ParentTwo {
	@Override

	// overriding the abstract method of inherited abstract class
	public void disp() {

		System.out.println(getJ());// accessing the value of instance variable by getter method of abstract class

		System.out.println("Child Class");// print statement for checking the execution
	}

}
