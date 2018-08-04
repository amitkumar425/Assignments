//Driver class implementing the class called SavingAccount and PaymentGateway

public class SavingAccountTester {

	public static void main(String[] args) {

		// Checking whether the NextAccountNumbe is accessible without object or not
		System.out.println("Next Available Acoount number is " + SavingAccount.getNextAccountNumber());

		// Creating A Non-Zero Savings Account
		SavingAccount savingsAcoount = new SavingAccount("Amit", 1000);

		// printing the Initial Instance member values
		System.out.println(savingsAcoount);

		// Trying to deposit illegal amount
		String message = savingsAcoount.depositAmount(-10000);
		System.out.println(message);

		// Trying to Withdraw illegal amount
		message = savingsAcoount.withdrawAmount(10000);
		System.out.println(message);

		// Valid Deposit
		message = savingsAcoount.depositAmount(10000);
		System.out.println(message);

		// valid withdraw
		message = savingsAcoount.withdrawAmount(500);
		System.out.println(message);

		// Creating the Zero-Balance Account
		SavingAccount zeroBalanceAccount = new SavingAccount("Kumar");

		// printing the Initial values of zeroBalanceObject
		System.out.println(zeroBalanceAccount);

		// withdrawing without any deposit
		System.out.println(zeroBalanceAccount.withdrawAmount(1000));

		// Depositing Balance
		System.out.println(zeroBalanceAccount.depositAmount(5000));

		// getting the next available Account number.
		System.out.println(zeroBalanceAccount.getNextAccountNumber());

		// printing the final value of zeroBalance Account
		System.out.println(zeroBalanceAccount);

		// Using PaymentGateWay class to transfer
		boolean status = PaymentGateway.transfer(savingsAcoount, zeroBalanceAccount, 5000);
		if (status == true) {
			System.out.println("Transfer Successfull");
		} else {
			System.out.println("Transfer Not Allowed!!!");
		}
	}

}
