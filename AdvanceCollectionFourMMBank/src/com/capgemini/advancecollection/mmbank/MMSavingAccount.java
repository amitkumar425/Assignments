//This class contains the setters and getters related to saving account.

package com.capgemini.advancecollection.mmbank;

public class MMSavingAccount {
	private int accountID;
	private String accountHolderName;
	private double accountBalance;
	private boolean isSalaryAccount;

	/**
	 * @param accountID
	 * @param accountHolderName
	 * @param accountBalance
	 * @param isSalaryAccount
	 */
	public MMSavingAccount(int accountID, String accountHolderName, double accountBalance, boolean isSalaryAccount) {
		super();
		this.accountID = accountID;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.isSalaryAccount = isSalaryAccount;
	}

	// Getters method
	public int getAccountID() {
		return accountID;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	// Setter methods
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	@Override
	public String toString() {
		return "MMSavingAccount [getAccountID()=" + getAccountID() + ", getAccountHolderName()="
				+ getAccountHolderName() + ", getAccountBalance()=" + getAccountBalance() + ", isSalaryAccount()="
				+ isSalaryAccount() + "]";
	}

}
