//This is the only class.
//It calculates your age in the days.

package com.capgemini.datetimeapi.alive;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CalculateDaysOfAlive {
	public static void main(String[] args) {
		System.out.println("Enter the date of birth : -");

		// taking the date of birth from the user
		Scanner scanner = new Scanner(System.in);
		String dobString = scanner.nextLine();

		//Checking if the provided date is valid or not.
		boolean isValidDobString = isValid(dobString);
		
		//If valid display the age in the days.
		if (isValidDobString) {
			LocalDate dobDate = getDate(dobString);
			if (dobDate.isBefore(LocalDate.now())) {
				Period difference = Period.between(dobDate, LocalDate.now());
				System.out.println("You have lived " + difference.toTotalMonths() * 31 + " Days");

			}
		}else {
			System.out.println("Invalid date of birth");
		}
	}

	// This method Validates the String provided by the user if it is valid or not.
	private static boolean isValid(String date) {
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
