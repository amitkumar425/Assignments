//this account extends the BankAccount .
//It has the specific instances Specific to the Saving account and their setters and getters.

package com.cg.moneymoneybankapp.account.pojo;

import com.cg.bank.framework.account.pojo.Customer;
import com.cg.bank.framework.account.pojo.SavingsAccount;

public class MMBankSavingsAccount extends SavingsAccount {

	public MMBankSavingsAccount(Customer accountHolder, boolean salary) {
		super(accountHolder, salary);
	}

	public MMBankSavingsAccount(Customer accountHolder, double accountBalance, boolean salary) {
		super(accountHolder, accountBalance, salary);
	}

}
