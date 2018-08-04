//This is the driver class that implements the BankAccountList.java and SavingAccount.java.

package com.capgemini.savingaccount;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SavingAccountTester {
	public static void main(String[] args) {

		// 1.a
		// Creating the Array list object
		List<SavingAccount> savingaccount = new ArrayList<SavingAccount>();

		// Creating several objects of the SavingAccount class
		SavingAccount savingaccountone = new SavingAccount(2000, 10, "Mehul SenGupta", true);
		SavingAccount savingaccounttwo = new SavingAccount(20_000, 11, "Amit Kumar", true);
		SavingAccount savingaccountthree = new SavingAccount(2000, 10, "Mehul SenGupta", true);
		SavingAccount savingaccountfour = new SavingAccount(1_00_000, 12, "Subhomoy Sarkar", true);
		SavingAccount savingaccountfive = new SavingAccount(5_00_000, 13, "Arijit Biswas", true);

		// Adding the savingaccount objects to the array list
		savingaccount.add(savingaccountone);
		savingaccount.add(savingaccounttwo);
		savingaccount.add(savingaccountthree);
		savingaccount.add(savingaccountfour);
		savingaccount.add(savingaccountfive);

		// Using the forEach() to print the object detail of the savingccount
		savingaccount.stream().forEach(arg -> System.out.println(arg));

		// Second part of the question.
		// Question No. 1.b
		// Writing the Object of SavingAccount into a file and then reading it the file
		// and displaying all SavingObjects one by one.

		// Creating the file called savingaccount.txt
		File file = new File("savingaccount.txt");

		// Various refernces
		FileOutputStream fileOutputStream;
		FileInputStream fileInputStream;
		ObjectInputStream objectInputStream;
		ObjectOutputStream objectoutputStream;

		try {

			// Writing the objects into file.
			fileOutputStream = new FileOutputStream(file);
			objectoutputStream = new ObjectOutputStream(fileOutputStream);
			for (SavingAccount s : savingaccount) {
				objectoutputStream.writeObject(s);
			}

			// Reading Objects from the file.
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);

			// Printing the read objects into the console.
			System.out.println(objectInputStream.readObject());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// Last part of the question.
		// Question No. 1.c
		// Creating the Object of BankAccountList that internally creates the TreeSet()
		// object.
		
		
		BankAccountList bankAccountList = new BankAccountList();

		// Adding the distinct as well as same objects to the created BankAccountList.
		bankAccountList.add(savingaccountone);
		bankAccountList.add(savingaccounttwo);
		bankAccountList.add(savingaccountthree);
		bankAccountList.add(savingaccountfour);
		bankAccountList.add(savingaccountfive);

		// Calling the static method of to get the set of objects which are added in the
		// BankAccountList.
		Set<SavingAccount> setOfObjects = BankAccountList.getAllObjects();

		// Displaying the total number of Saving Accounts added in the BankAccountList.
		System.out.println("Total Distinct Saving Account Added = " + BankAccountList.getNumberOfSavingAccounts());

		// Displaying the Content of all the objects received, using forEach().
		setOfObjects.stream().forEach(object -> System.out.println(object));

	}

}
