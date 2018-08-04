//Parent class with various constructor with different number of parameters

public class BaseOne {
	private int value;
	private int age;

	/**
	 * @param value
	 * @param age
	 */
	public BaseOne(int value, int age) {
		this.value = value;
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	
	//toString() to print the object information
	public String toString() {
		return "BaseOne [value=" + value + ", age=" + age + "]";
	}

}
