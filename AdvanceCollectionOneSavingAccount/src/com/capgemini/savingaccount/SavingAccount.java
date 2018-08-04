//This class has the implementation of various getters of the instance 
//members and the industry methods like withdraw() and deposit().
//It also overrides the hashCode() and equals() method to check the duplicate objects.

package com.capgemini.savingaccount;

import java.io.Serializable;

public class SavingAccount implements Comparable<SavingAccount>,Serializable  {
	private double accountbalance;
	private int accountid;
	private String accountholdername;
	private boolean issalary;

	/**
	 * @param accountbalance
	 * @param accountid
	 * @param accountholdername
	 * @param issalary
	 */
	public SavingAccount(double accountbalance, int accountid, String accountholdername, boolean issalary) {
		super();
		this.accountbalance = accountbalance;
		this.accountid = accountid;
		this.accountholdername = accountholdername;
		this.issalary = issalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountbalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((accountholdername == null) ? 0 : accountholdername.hashCode());
		result = prime * result + accountid;
		result = prime * result + (issalary ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		if (Double.doubleToLongBits(accountbalance) != Double.doubleToLongBits(other.accountbalance))
			return false;
		if (accountholdername == null) {
			if (other.accountholdername != null)
				return false;
		} else if (!accountholdername.equals(other.accountholdername))
			return false;
		if (accountid != other.accountid)
			return false;
		if (issalary != other.issalary)
			return false;
		return true;
	}

	// Getters to get the instance member value;
	public double getAccountbalance() {
		return accountbalance;
	}

	public int getAccountid() {
		return accountid;
	}

	public String getAccountholdername() {
		return accountholdername;
	}

	public boolean isIssalary() {
		return issalary;
	}

	// withdrawing method
	public String withdrawAmount(double amountToBeWithdrawn) {
		String message;
		if (getAccountbalance() > amountToBeWithdrawn) {
			accountbalance -= amountToBeWithdrawn;
			message = "Amount Deduction = " + amountToBeWithdrawn + ". Total Remainig Account Balance = "
					+ getAccountbalance();
			return message;
		} else {
			message = "Insufficient Account Balance";
			return message;
		}
	}

	// deposit method
	public String deposit(double amountToBeDeposited) {
		String message;
		if (amountToBeDeposited > 0) {
			accountbalance += amountToBeDeposited;
			message = "Amount Deposited = " + amountToBeDeposited + ". Total Available Balance = "
					+ getAccountbalance();
			return message;
		} else {
			message = "Amount not a legal amount for deposit. Rectify Your Deposit and Try Again";
			return message;
		}
	}

	@Override
	public String toString() {
		return "SavingAccount [accountbalance=" + accountbalance + ", accountid=" + accountid + ", accountholdername="
				+ accountholdername + ", issalary=" + issalary + "]";
	}

	@Override
	public int compareTo(SavingAccount savingaccount) {
		return this.getAccountid() - savingaccount.getAccountid();
	}

}
