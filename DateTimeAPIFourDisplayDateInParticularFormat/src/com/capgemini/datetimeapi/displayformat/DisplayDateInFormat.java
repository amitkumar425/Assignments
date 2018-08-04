//This class displays the given date in two different formats(if the input is as per specified).
//First format = dd/mm/yyyy and 
//second format = dd, month name, year .
//If the input is in unspecified format then it throws an exception printing the stackTrace.

package com.capgemini.datetimeapi.displayformat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DisplayDateInFormat {

	public static void main(String[] args) {
		System.out.println("Enter the Date in 8 digits (ddmmyyyy) format :");

		// Taking input from the user.
		Scanner scanner = new Scanner(System.in);
		String dateProvided = scanner.nextLine();

		// Checking if the given date is valid or not.
		boolean isValid = validateDate(dateProvided);

		// If valid then return the date in the desired format.
		if (isValid == true) {

			// Converting the given String into localDate reference.
			LocalDate date = getDate(dateProvided);

			System.out.println("Date in dd/mm/yyyy format = ");
			displayInddmmyyyy(date);
			System.out.println("Date in dd, month name, yyyy format = ");
			displayInPlainFormat(date);
		} else {
			System.out.println("Invalid Date format");
		}

	}

	// This method displays the date in dd, month name, year format.
	private static void displayInPlainFormat(LocalDate date) {
		System.out.println(date.getDayOfMonth() + " " + date.getMonth() + ", " + date.getYear());
	}

	// This method displays the date in dd/MM/yyyy format.
	private static void displayInddmmyyyy(LocalDate date) {
		System.out.println(date.getDayOfMonth() + "/" + date.getMonthValue() + "/" + date.getYear());

	}

	// This method Validates the String provided by the user if it is valid or not.
	private static boolean validateDate(String date) {
		if (date.length() == 8) {
			if (Integer.parseInt(date.substring(0, 1)) > 0 && Integer.parseInt(date.substring(0, 1)) <= 31) {
				if (Integer.parseInt(date.substring(2, 3)) > 0 && Integer.parseInt(date.substring(2, 3)) <= 12) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	// This method converts the given String into LocalDate object.
	private static LocalDate getDate(String date) {
		LocalDate localDate = null;
		try {
			DateTimeFormatter dateFormate = DateTimeFormatter.ofPattern("ddMMyyyy");
			localDate = LocalDate.parse(date, dateFormate);
		} catch (DateTimeParseException e) {
			e.printStackTrace();
		}
		return localDate;

	}
}
