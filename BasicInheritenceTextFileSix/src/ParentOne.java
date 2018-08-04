//Abstract Parent class with the abstract method called disp()

public abstract class ParentOne {
	private static int j = 20;// an instance static member

	// abstract method to be overridden by inheriting class
	public abstract void disp();

	/**
	 * @return the j
	 */
	public static int getJ() {
		return j;
	}

}
