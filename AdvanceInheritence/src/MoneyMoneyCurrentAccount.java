//Concrete class implementing the abstract methods of CurrentAccount
public class MoneyMoneyCurrentAccount extends CurrentAccount {

	//Parameterized Constructor
	public MoneyMoneyCurrentAccount(int aoountNumber, String accountHolderName, double accountBalance,
			double creditLimit) {
		super(aoountNumber, accountHolderName, accountBalance, creditLimit);
		// TODO Auto-generated constructor stub
	}
	
	//Method to withdraw amount 
	public String withdrawAmount(double amountToBeWithdrawn) {
		String message=null;
		if(getAccountBalance()+getCreditLimit()<amountToBeWithdrawn) {
			message = "You exceed the Credit limit !!!!";
		}
		else {
			setAccountBalance(getAccountBalance()-amountToBeWithdrawn);
			message = "You Have Succefully Withdrawn Rs: "+amountToBeWithdrawn+".\n Remaining Balance = Rs: "+(getAccountBalance()+getCreditLimit());
		}
		return message;
	}

	@Override
	public String toString() {
		return "MoneyMoneyCurrentAccount [accountBalance=" + getAccountBalance() + ", toString()=" + super.toString() + "]";
	}

}
