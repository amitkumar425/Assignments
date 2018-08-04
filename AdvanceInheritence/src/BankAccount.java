//Parent Class which is abstract containing one abstract method called withdraw()
//This is the class which is inherited by CurrentAccount, SavingAccount, 
//MoneyMoneySavingAccount and MoneyMoneyCurrentAccount 
public abstract class BankAccount {
	private int aoountNumber;
	private String accountHolderName;
	private double accountBalance;

	// Parameterized Constructor
	public BankAccount(int aoountNumber, String accountHolderName, double accountBalance) {
		this.aoountNumber = aoountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	// Abstract method to be implemented by child class
	public abstract String withdrawAmount(double amountToBeWithdrawn);

	/**
	 * @param accountHolderName the accountHolderName to set
	 */

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	// deposit method
	public String depositAmount(double amountToBeDeposited) {
		String message;
		if (amountToBeDeposited > 0) {
			accountBalance += amountToBeDeposited;
			message = "Amount Deposited = " + amountToBeDeposited + ". Total Available Balance = "
					+ getAccountBalance();
			return message;
		} else {
			message = "Amount not a legal amount for deposit. Rectify Your Deposit and Try Again";
			return message;
		}
	}

	/**
	 * @return the aoountNumber
	 */
	public int getAoountNumber() {
		return aoountNumber;
	}

	/**
	 * @return the accountHolderName
	 */
	public String getAccountHolderName() {
		return accountHolderName;
	}

	/**
	 * @return the accountBalance
	 */
	public double getAccountBalance() {
		return accountBalance;
	}

	/**
	 * sets the accountBalance
	 */
	protected void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "BankAccount [getAoountNumber()=" + getAoountNumber() + ", getAccountHolderName()="
				+ getAccountHolderName() + ", getAccountBalance()=" + getAccountBalance() + "]";
	}

}
