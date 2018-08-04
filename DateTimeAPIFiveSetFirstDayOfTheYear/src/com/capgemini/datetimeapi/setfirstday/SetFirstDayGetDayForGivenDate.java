//This is the only class.
//This class sets the first day of the year and then calculate the day of the given day.

package com.capgemini.datetimeapi.setfirstday;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class SetFirstDayGetDayForGivenDate {

	private static Calendar  calendar = Calendar.getInstance();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Date dd/mm/yyyy : ");
		String dateProvided = scanner.nextLine();
		calendar = getCalendar(dateProvided);
	}

	private static Calendar getCalendar(String dateProvided) {
		
		return null;
	}

}
