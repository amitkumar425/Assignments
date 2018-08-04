//Concrete class implementing all the abstract methods of abstract class called SavingAccount 

public class MoneyMoneySavingAccount extends SavingAccount {

	// Parameterized Constructor
	public MoneyMoneySavingAccount(int aoountNumber, String accountHolderName, double accountBalance,
			boolean isSalaried) {
		super(aoountNumber, accountHolderName, accountBalance, isSalaried);
	}

	@Override
	// withdrawing method
	public String withdrawAmount(double amountToBeWithdrawn) {
		String message;
		if (getAccountBalance() - getMinbal() > amountToBeWithdrawn) {
			setAccountBalance(getAccountBalance() - amountToBeWithdrawn);
			message = "Amount Deduction = " + amountToBeWithdrawn + ". Total Remainig Account Balance = "
					+ getAccountBalance();
			return message;
		} else {
			message = "Insufficient Account Balance";
			return message;
		}
	}

	@Override
	public String toString() {
		return "MoneyMoneySavingAccount [accountBalance=" + getAccountBalance() + ", toString()=" + super.toString()
				+ "]";
	}
}
