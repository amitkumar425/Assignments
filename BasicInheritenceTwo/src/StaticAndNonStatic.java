//Class having the static and non-static instance members 
//and instance geteers and setters method for accessing them. 
public class StaticAndNonStatic {

	// Instance members of the class
	private static int staticMember;
	private int nonSaticMember;

	/**
	 * @return the staticMember
	 */
	public static int getStaticMember() {
		return staticMember;
	}

	/**
	 * @param staticMember the staticMember to set
	 */
	public static void setStaticMember(int staticMember) {
		StaticAndNonStatic.staticMember = staticMember;
	}

	/**
	 * @return the nonSaticMember
	 */
	public int getNonSaticMember() {
		return nonSaticMember;
	}

	/**
	 * @param nonSaticMember the nonSaticMember to set
	 */
	public void setNonSaticMember(int nonSaticMember) {
		this.nonSaticMember = nonSaticMember;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StaticAndNonStatic [nonSaticMember=" + nonSaticMember + ", staticMember=" + getStaticMember() + "]";
	}

}
