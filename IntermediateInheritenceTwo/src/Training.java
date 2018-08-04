//Parent class of Public and corporate training
public abstract class Training {
	private int ID;
	private String subject;
	private double fees;

	/**
	 * @param iD
	 * @param subject
	 * @param fees
	 */
	public Training(int ID, String subject, double fees) {
		this.ID = ID;
		this.subject = subject;
		this.fees = fees;
	}

	public abstract double getOrderValue();

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @return the fees
	 */
	public double getFees() {
		return fees;
	}

}
