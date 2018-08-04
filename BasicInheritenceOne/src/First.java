//Class with two instance members and getters and setters methods.

public class First {
	private String nameOfClass;
	private int classValue;

	// Parameterized constructor to initialize the instance members of the class
	public First(String nameOfClass, int classValue) {
		this.nameOfClass = nameOfClass;
		this.classValue = classValue;
	}

	/**
	 * @return the nameOfClass
	 */
	public String getNameOfClass() {
		return nameOfClass;
	}

	/**
	 * @param nameOfClass the nameOfClass to set
	 */
	public void setNameOfClass(String nameOfClass) {
		this.nameOfClass = nameOfClass;
	}

	/**
	 * @return the classValue
	 */
	public int getClassValue() {
		return classValue;
	}

	/**
	 * @param classValue the classValue to set
	 */
	public void setClassValue(int classValue) {
		this.classValue = classValue;
	}

	@Override
	public String toString() {
		return "First [nameOfClass=" + nameOfClass + ", classValue=" + classValue + ", getNameOfClass()="
				+ getNameOfClass() + ", getClassValue()=" + getClassValue() + "]";
	}

}
