//This is the only class.
//This class accepts the date in the string format and checks the validity.
//If it is valid then adds the valid date provided by the user and prints the future date.

package com.capgemini.datetimeapi.acceptdateasstring;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TesterAcceptDateAsString {

	public static void main(String[] args) {
		
		System.out.println("Enter the Date in 8 digits (ddmmyyyy) format :");
		
		//Accepting the date as String from the user.
		Scanner scanner = new Scanner(System.in);
		String dateProvided = scanner.nextLine();

		//validating the string by calling validate method defined below. 
		boolean isValid = validateDate(dateProvided);

		//if valid prints the furure date
		if (isValid == true) {
			LocalDate date = getDate(dateProvided);
			System.out.println("Entered Date : " + date);

			System.out.println("Enter number of days after which future date is to find : ");
			int dateToBeAdded = scanner.nextInt();

			if (dateToBeAdded > 0 || dateToBeAdded < 32) {
				System.out.println("Future Date : " + date.plusDays(dateToBeAdded));
				java.lang.System.exit(0);
			} else {
				System.out.println("Invalid days Addition");
			}
		} else {
			System.out.println("Invalid Date Format");
		}
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
