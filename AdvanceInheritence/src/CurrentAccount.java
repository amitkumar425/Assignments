//Abstract Class inheriting the BankAccount an another abstract class
//Having extra field called creditLimit
public abstract class CurrentAccount extends BankAccount {

	// Field for allowing the customer to withdraw more than the deposit in their
	// account balance
	private final double creditLimit;

	//// Parameterized constructor to initialize field of this class and its parent
	//// class
	// via super keyword
	public CurrentAccount(int aoountNumber, String accountHolderName, double accountBalance, double creditLimit) {
		super(aoountNumber, accountHolderName, accountBalance);
		this.creditLimit = creditLimit;
	}

	/**
	 * @return the creditLimit
	 */
	public double getCreditLimit() {
		return creditLimit;
	}

	// Abstract method to be implemented by inheriting class(Child class)
	public abstract String withdrawAmount(double amountToBeWithdrawn);

	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + "]" + super.toString();
	}

}
