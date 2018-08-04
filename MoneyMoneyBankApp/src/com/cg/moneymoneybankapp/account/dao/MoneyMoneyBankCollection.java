package com.cg.moneymoneybankapp.account.dao;

import com.cg.bank.framework.account.dao.BankAccountCollection;
import com.cg.bank.framework.account.pojo.BankAccount;

public class MoneyMoneyBankCollection extends BankAccountCollection {

	public void removeBankAccountByAccountNumber(int accountNumberToBeRemoved) {
		for(BankAccount bankAccount : BankAccountCollection.viewAll()) {
			if(bankAccount.getAccountNumber()==accountNumberToBeRemoved) {
				BankAccountCollection.viewAll().remove(bankAccount);
				break;
			}
		}
	}

	public BankAccount getAccountByAccountNumber(int accountToBeSearched) {
		for(BankAccount bankAccount : BankAccountCollection.viewAll()) {
			if(bankAccount.getAccountNumber()==accountToBeSearched) {
				return bankAccount;
			}
		}
		return null;
	}
	
	
}
