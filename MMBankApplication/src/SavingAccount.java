//This Class Implements the logic of Saving account

public class SavingAccount {
	private final static String BANK_NAME = "Money Money Bank";
	private String customerName;
	private int accountNumber = 50010000;
	private static int NextAccountNumber = 50010000;
	private double balance;

	// InitializerBloc
	{
		accountNumber += 1;
		NextAccountNumber = accountNumber + 1;
	}

	// Parameterized Constructor
	public SavingAccount(String customerName, double balance) {
		this.customerName = customerName;
		this.balance = balance;
	}

	// Parameterized Constructor For Zero Balance Account
	public SavingAccount(String customerName) {
		this.customerName = customerName;
	}

	// return the bankName

	public static String getBankName() {
		return BANK_NAME;
	}

	// return the customerName

	public String getCustomerName() {
		return customerName;
	}

	// return the accountNumber

	public int getAccountNumber() {
		return accountNumber;
	}

	// return the balance

	public double getBalance() {
		return balance;
	}

	// withdrawing method
	public String withdrawAmount(double amountToBeWithdrawn) {
		String message;
		if (getBalance() > amountToBeWithdrawn) {
			balance -= amountToBeWithdrawn;
			message = "Amount Deduction = " + amountToBeWithdrawn + ". Total Remainig Account Balance = "
					+ getBalance();
			return message;
		} else {
			message = "Insufficient Account Balance";
			return message;
		}
	}

	// deposit method
	public String depositAmount(double amountToBeDeposited) {
		String message;
		if (amountToBeDeposited > 0) {
			balance += amountToBeDeposited;
			message = "Amount Deposited = " + amountToBeDeposited + ". Total Available Balance = " + getBalance();
			return message;
		} else {
			message = "Amount not a legal amount for deposit. Rectify Your Deposit and Try Again";
			return message;
		}
	}

	// For getting the Next Account number that is available.
	public static int getNextAccountNumber() {
		return NextAccountNumber;
	}

	@Override
	public String toString() {
		return "SavingAccount [customerName=" + customerName + ", accountNumber=" + accountNumber + ", balance="
				+ balance + ", getCustomerName()=" + getCustomerName() + ", getAccountNumber()=" + getAccountNumber()
				+ ", getBalance()=" + getBalance() + "]";
	}

}
