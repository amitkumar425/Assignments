package com.cg.moneymoneybankapp.ui;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.cg.bank.framework.account.pojo.BankAccount;
import com.cg.moneymoneybankapp.controller.MoneyMoneyBankController;

public class MoneyMoneyBankUserInterface {

	private static Scanner scanner = new Scanner(System.in);
	private static Map<String, Object> accountDetails = new HashMap<>();
	
	private static Set<BankAccount> listOfAllAccounts = new TreeSet<BankAccount>();
	
	private static MoneyMoneyBankController mmBankController = new MoneyMoneyBankController();
	
	
	public static void start() throws IOException {
		while (true) {
			showMenu();
		}
	}

	private static void showMenu() throws IOException {
		System.out.println("Make Choice : ");
		System.out.println("1. Add New Savings Account");
		System.out.println("2. Add New Current Account");
		System.out.println("3. See All Accounts List");
		System.out.println("4. Get Next Accountn Number");
		System.out.println("5. Search Account By Account Number");
		System.out.println("6. Exit");

		acceptChoice();

	}

	private static void acceptChoice() throws IOException {

		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			addNewSavingsAccount();
			break;
		case 2:
			addNewCurrentAccount();
			break;
		case 3:
			showAllAccountList();
			break;
		case 4:
			showNextAccountNumber();
			break;
		case 5:
			searchAccountByAccountNumber();
			break;
		case 6:
			System.exit(0);
			break;
		default:
			System.out.println("Enter a Valid Choice");
		}
	}

	private static void searchAccountByAccountNumber() throws IOException {
		System.out.println("Enter the account number");
		int accountNumber = scanner.nextInt();
		System.out.println(mmBankController.getAccountByAccountNumber(accountNumber));
	}

	private static void showNextAccountNumber() {
		System.out.println(mmBankController.getNextAccountNumber());
	}

	private static void showAllAccountList() {
		listOfAllAccounts = mmBankController.getAllAccountList();
		for(BankAccount bankAccount : listOfAllAccounts) {
			System.out.println(bankAccount);
		}
	}

	private static void addNewCurrentAccount() throws IOException {

		System.out.println("Enter Account Holder Name: ");
		String accountHolderName = scanner.next();
		accountDetails.put("accountHolderName", accountHolderName);
		System.out.println("Enter Account Balance: ");
		double accountBalance = scanner.nextDouble();
		accountDetails.put("accountBalance", accountBalance);
		System.out.println("Enter Salary?(n/y): ");
		String salary = scanner.next();
		accountDetails.put("salary", salary.equalsIgnoreCase("n")?false:true);
		acceptCustomerDetails();
		mmBankController.createNewCurrentAccount(accountDetails);
	}

	private static void addNewSavingsAccount() throws IOException {

		System.out.println("Enter Account Holder Name: ");
		String accountHolderName = scanner.next();
		accountDetails.put("accountHolderName", accountHolderName);
		System.out.println("Enter Account Balance: ");
		double accountBalance = scanner.nextDouble();
		accountDetails.put("accountBalance", accountBalance);
		System.out.println("Enter Salary?(n/y): ");
		String salary = scanner.next();
		accountDetails.put("salary", salary.equalsIgnoreCase("n")?false:true);
		acceptCustomerDetails();
		mmBankController.createNewSavingsAccount(accountDetails);
	}

	private static void acceptCustomerDetails() throws IOException {
		System.out.println("Enter Contact Number: ");
		Long contact =scanner.nextLong();
		accountDetails.put("contact", contact);
		System.out.println("Enter Date of Birth(dd/mm/yyyy): ");
		String dobStr =scanner.next();
		LocalDate dateOfBirth = getDate(dobStr);
		accountDetails.put("dateOfBirth", dateOfBirth);
		
	}

	
	private static LocalDate getDate(String dobStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(dobStr, formatter);
		return date;
	}
}
