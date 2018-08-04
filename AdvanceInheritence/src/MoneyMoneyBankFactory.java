//Concrete class inheriting the BankFactory class and implementing  all its abstract methods
//This class is the ENTRY POINT for the application
public class MoneyMoneyBankFactory extends BankFactory {

	@Override
	public SavingAccount getNewSavngAccount(int aoountNumber, String accountHolderName, double accountBalance,
			boolean isSalaried) {
		MoneyMoneySavingAccount savingAccount = new MoneyMoneySavingAccount(aoountNumber, accountHolderName,
				accountBalance, isSalaried);
		return savingAccount;
	}

	@Override
	public CurrentAccount getNewCurrentAccount(int aoountNumber, String accountHolderName, double accountBalance,
			double creditLimit) {

		MoneyMoneyCurrentAccount currentAccount = new MoneyMoneyCurrentAccount(aoountNumber, accountHolderName,
				accountBalance, creditLimit);

		return currentAccount;
	}

}
