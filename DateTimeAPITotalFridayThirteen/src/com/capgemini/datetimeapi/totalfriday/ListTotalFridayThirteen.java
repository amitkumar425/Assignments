//This is the only class.
//This class lists all the Friday the 13th from 20th century.
package com.capgemini.datetimeapi.totalfriday;

import java.time.LocalDate;

public class ListTotalFridayThirteen {

	public static void main(String[] args) {

		// creating the start and end days of 20th century.
		LocalDate startDate = LocalDate.of(1900, 1, 1);
		LocalDate lastDate = LocalDate.of(1999, 12, 31);

		// Listing all the Fridays the 13th in 20th century
		System.out.println("List of all Friday the 13th in 20th Century ");
		for (LocalDate date = startDate; date.isBefore(lastDate); date = date.plusDays(1)) {
			if (date.getDayOfMonth() == 13 && date.getDayOfWeek().toString().contentEquals("FRIDAY")) {
				System.out.println(date);
			}
		}
	}

}
