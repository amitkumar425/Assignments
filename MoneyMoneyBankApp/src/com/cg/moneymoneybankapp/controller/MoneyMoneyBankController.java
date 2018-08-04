//This class will act as an abstract controller class for the implementing  banks. 
package com.cg.moneymoneybankapp.controller;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import com.cg.bank.framework.account.pojo.BankAccount;
import com.cg.bank.framework.account.pojo.Customer;
import com.cg.bank.framework.controller.BankController;
import com.cg.moneymoneybankapp.factory.MMBankFactory;

public class MoneyMoneyBankController extends BankController {

	private MMBankFactory mmBankFactory = new MMBankFactory();

	@Override
	public void createNewCurrentAccount(Map<String, Object> map) {
		mmBankFactory.createNewCurrentAccount(map);
	}

	@Override
	public void createNewSavingsAccount(Map<String, Object> map) {
		mmBankFactory.createNewSavingsAccount(map);
	}

	public Set<BankAccount> getAllAccountList() {
		return MMBankFactory.getAllAccountList();
	}

	public int getNextAccountNumber() {
		return mmBankFactory.getNextAccountNumber();

	}

	public BankAccount  getAccountByAccountNumber(int accountNumber) {
		return mmBankFactory.getAccountByAccountNumber(accountNumber);
	}

	@Override
	public Collection<BankAccount> getAllAccounts() {
		return MMBankFactory.getAllAccountList();
	}

	
	//Not yet Implemented.
	@Override
	public Collection<Customer> getAllCustomers() {
		
		return null;
	}

}
