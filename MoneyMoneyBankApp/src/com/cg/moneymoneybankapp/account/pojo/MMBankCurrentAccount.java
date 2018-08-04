//This class extends the BankAccount .
//it has specific instances related to CurrentAccount and their setters and getters.

package com.cg.moneymoneybankapp.account.pojo;

import com.cg.bank.framework.account.pojo.CurrentAccount;
import com.cg.bank.framework.account.pojo.Customer;

public class MMBankCurrentAccount extends CurrentAccount {

	public MMBankCurrentAccount(Customer accountHolder, double accountBalance, double odLimit) {
		super(accountHolder, accountBalance, odLimit);
	}
	
}
