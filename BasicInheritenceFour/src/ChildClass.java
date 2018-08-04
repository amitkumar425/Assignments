//Class inheriting the class called SingleLevelInheritance.
//This class is having only one instance member .
public class ChildClass extends SingleLevelInheritance {

	private int varTwo;

	// Parameterized constructor to initialize the instance members of its parent
	// class and its own instance member.
	public ChildClass(int varOne, int varTwo) {
		super(varOne);
		this.varTwo = varTwo;
		System.out.println(varTwo);
	}

}
