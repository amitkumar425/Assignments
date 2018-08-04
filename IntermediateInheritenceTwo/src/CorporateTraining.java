//class extending and implementing the Training class
public class CorporateTraining extends Training {

	private int days;

	// Parameterized Constructor
	public CorporateTraining(int ID, String subject, double fees, int days) {
		super(ID, subject, fees);
		this.days = days;
	}

	// method to get order value
	public double getOrderValue() {
		return getFees() * days;
	}
}
