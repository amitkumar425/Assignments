//Class inheriting the BankAccount 
//Having instance member like MINBAL and isSalaried
public abstract class SavingAccount extends BankAccount {

	private boolean isSalaried;// variable to check if the account is salary account or not
	private static final double MINBAL = 1000;// Constant to put a lower limit on the balance that has to be there in
												// the account

	// Parameterized constructor
	public SavingAccount(int aoountNumber, String accountHolderName, double accountBalance, boolean isSalaried) {
		super(aoountNumber, accountHolderName, accountBalance);
		this.isSalaried = isSalaried;
	}

	/**
	 * @return the isSalaried
	 */
	public boolean isSalaried() {
		return isSalaried;
	}

	/**
	 * @return the minbal
	 */
	public static double getMinbal() {
		return MINBAL;
	}

	// Abstract method to be implemented by child class
	public abstract String withdrawAmount(double amountToBeWithdrawn);

	@Override
	public String toString() {
		return "SavingAccount [isSalary=" + isSalaried + ", accountBalance=" + getAccountBalance() + "]" + "  "
				+ super.toString();
	}
}
