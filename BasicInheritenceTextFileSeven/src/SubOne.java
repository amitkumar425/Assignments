//Child class with various constructor with different number of parameters

public class SubOne extends BaseOne{
	private int SubOneVariable;
	
	
	//default constructor
	public SubOne() {
		super(0,0);
	}
	
	/**
	 * @param value
	 * @param age
	 * @param subOneVariable
	 */
	
	public SubOne(int value, int age, int subOneVariable) {
		super(value, age);
		SubOneVariable = subOneVariable;
	}

	/**
	 * @param value
	 * @param age
	 */
	public SubOne(int value, int age) {
		super(value, age);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	//toString() to print the object information
	public String toString() {
		return "SubOne [SubOneVariable=" + SubOneVariable + "]";
	}
	
	
	
	
}
