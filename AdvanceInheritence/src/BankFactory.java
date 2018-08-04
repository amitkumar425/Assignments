//Abstract Class inherited by MoneyMOneyBankFactory class 

public abstract class BankFactory {

	// Two abstract methods implemented by inheriting class
	public abstract SavingAccount getNewSavngAccount(int aoountNumber, String accountHolderName, double accountBalance,
			boolean isSalaried);

	public abstract CurrentAccount getNewCurrentAccount(int aoountNumber, String accountHolderName,
			double accountBalance, double creditLimit);
}
