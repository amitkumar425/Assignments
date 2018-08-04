//Class to Support the Money Transfer between two person's Saving Account

public class PaymentGateway {
	public static boolean transfer(SavingAccount sender, SavingAccount reciever, double amount) {
		if (sender.getBalance() >= amount) {
			sender.withdrawAmount(amount);
			reciever.depositAmount(amount);
			return true;
		} else {
			return false;
		}
	}
}
