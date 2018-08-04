//class extending and implementing the Training class
public class PublicTraining extends Training {
	private int participants;

	/**
	 * @param ID
	 * @param subject
	 * @param fees
	 */

	// Parameterized Constructor
	public PublicTraining(int ID, String subject, double fees, int participants) {
		super(ID, subject, fees);
		this.participants = participants;
	}

	// methods for getting the cost
	public double getOrderValue() {
		return getFees() * participants;
	}
}
