//Class inheriting the class called FirstLevelClass 
//This is to show the multilevel inheritance
public class SecondLevelClass extends FirstLevelClass {
	private int secondLevelClassVariable;

	/**
	 * @param secondLevelClassVariable constructor
	 */
	public SecondLevelClass(int secondLevelClassVariable, int firstLevelClassVariable) {
		super(firstLevelClassVariable);
		this.secondLevelClassVariable = secondLevelClassVariable;
		System.out.println("secondLevelClassVariable = " + secondLevelClassVariable);
	}

}
