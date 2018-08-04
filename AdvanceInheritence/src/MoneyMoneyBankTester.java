//Main class to test the working of the Application.
public class MoneyMoneyBankTester {

	public static void main(String[] args) {

		// Assigning the instance of MoneyMoneyBankFactory to BankFactory
		BankFactory bankFactory = new MoneyMoneyBankFactory();

		// getting saving account object
		SavingAccount savingAccount = bankFactory.getNewSavngAccount(500200, "Amit", 1_00_000, true);

		// getting current account object
		CurrentAccount currentAccount = bankFactory.getNewCurrentAccount(400500, "Kumar", 1_00_000, 20000);

		// executing the withdraw method for saving account
		String message = savingAccount.withdrawAmount(40_000);
		System.out.println(message);

		// Executing the withdraw method for current account
		message = currentAccount.withdrawAmount(1_40_000);
		System.out.println(message);

		// Printing the information about both the objects
		System.out.println(savingAccount.toString());
		System.out.println(currentAccount.toString());
	}

}
