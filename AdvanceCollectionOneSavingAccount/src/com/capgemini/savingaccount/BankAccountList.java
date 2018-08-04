//This class maintains the list of saving bank account .

package com.capgemini.savingaccount;

import java.util.Set;
import java.util.TreeSet;

public class BankAccountList {
	private static Set<SavingAccount> treeSet;

	// Default Constructor to create the object of TreeSet.
	public BankAccountList() {
		treeSet = new TreeSet<SavingAccount>();
	}

	// This method just adds the object to the TreeSet.
	public void add(SavingAccount savingAccountObject) {
		treeSet.add(savingAccountObject);
	}

	// This method return the number of Saving Accounts added
	public static int getNumberOfSavingAccounts() {
		return treeSet.size();
	}

	// This method returns the Set of total objects added in the tree set.
	public static Set<SavingAccount> getAllObjects() {
		return treeSet;
	}
}
