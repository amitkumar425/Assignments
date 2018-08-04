//This class is the abstraction for all the Object creation by any implementing bank. 

package com.cg.moneymoneybankapp.factory;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

import com.cg.bank.framework.account.dao.BankAccountCollection;
import com.cg.bank.framework.account.pojo.BankAccount;
import com.cg.bank.framework.factory.BankFactory;
import com.cg.moneymoneybankapp.account.dao.MoneyMoneyBankCollection;
import com.cg.moneymoneybankapp.account.pojo.MMBankCurrentAccount;
import com.cg.moneymoneybankapp.account.pojo.MMBankCustomer;
import com.cg.moneymoneybankapp.account.pojo.MMBankCustomerAddress;
import com.cg.moneymoneybankapp.account.pojo.MMBankSavingsAccount;

public class MMBankFactory extends BankFactory {

	
	
	MoneyMoneyBankCollection mmBankCollection = new MoneyMoneyBankCollection();
	BankAccount mmBankAccount;
	MMBankCustomer mmBankCustomer;
	MMBankCustomerAddress mmBankCustomerAddress;

	@Override
	public void createNewCurrentAccount(Map<String, Object> map) {
		mmBankCustomerAddress = new MMBankCustomerAddress(map.get("houseNo").toString(), map.get("street").toString(),
				map.get("city").toString(), map.get("state").toString(), (int) map.get("pinCode"));

		mmBankCustomer = new MMBankCustomer(map.get("customerName").toString(), (long) map.get("contactNumber"),
				(LocalDate) map.get("dateOfBirth"), mmBankCustomerAddress, map.get("nationality").toString(),
				map.get("gender").toString());

		mmBankAccount = new MMBankCurrentAccount(mmBankCustomer, (double) map.get("accountBalance"),
				(double) map.get("odLimit"));
		mmBankCollection.addBankAccount(mmBankAccount);
	}

	@Override
	public void createNewSavingsAccount(Map<String, Object> map) {

		if ((boolean) map.get("salary") == true) {

			mmBankCustomerAddress = new MMBankCustomerAddress(map.get("houseNo").toString(),
					map.get("street").toString(), map.get("city").toString(), map.get("state").toString(),
					(int) map.get("pinCode"));

			mmBankCustomer = new MMBankCustomer(map.get("customerName").toString(), (long) map.get("contactNumber"),
					(LocalDate) map.get("dateOfBirth"), mmBankCustomerAddress, map.get("nationality").toString(),
					map.get("gender").toString());

			mmBankAccount = new MMBankSavingsAccount(mmBankCustomer,
					(boolean) map.get("salary"));
		}else {
			mmBankCustomerAddress = new MMBankCustomerAddress(map.get("houseNo").toString(), map.get("street").toString(),
					map.get("city").toString(), map.get("state").toString(), (int) map.get("pinCode"));

			mmBankCustomer = new MMBankCustomer(map.get("customerName").toString(), (long) map.get("contactNumber"),
					(LocalDate) map.get("dateOfBirth"), mmBankCustomerAddress, map.get("nationality").toString(),
					map.get("gender").toString());

			mmBankAccount = new MMBankSavingsAccount(mmBankCustomer, (double) map.get("accountBalance"),
					(boolean) map.get("salary"));
			
		}

		mmBankCollection.addBankAccount(mmBankAccount);
	}



	public static  Set<BankAccount> getAllAccountList() {
		return BankAccountCollection.viewAll();
	}

	public int getNextAccountNumber() {
		return BankAccount.getNextAccountNumber();
	}

	public BankAccount getAccountByAccountNumber(int accountToBeSearched) {
		return mmBankCollection.getAccountByAccountNumber(accountToBeSearched);
	}
	
}
