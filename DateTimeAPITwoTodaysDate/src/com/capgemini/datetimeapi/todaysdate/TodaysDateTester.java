//This is the only class.
//This class prints the todays date in the Desired format.

package com.capgemini.datetimeapi.todaysdate;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class TodaysDateTester {

	public static void main(String[] args) {
		// Getting Todays date.
		LocalDate todaysDate = LocalDate.now();

		// Setting the desired format by DateTimeFormatter.
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("eeee, MMMM dd, yyyy");

		// Getting the todays date in the desired format.
		String date = todaysDate.format(dateTimeFormatter);

		// Displaying Todays date in the desired format.
		System.out.println("Todays Date is :-\n" + date);
	}
}
