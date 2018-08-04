//Class Describing the person's name and date of birth  

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {
	private String name;
	private Date datOfBirth = new Date();
	private int day, month, year;

	// constructor to initialize the object.
	public Person(String name, int date, int month, int year) {
		this.name = name;
		this.day = date;
		this.month = month;
		this.year = year;
		String DOB = date + "/" + month + "/" + year;// creating the object for dateOfBirth instance member
		DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");// object for specifying the format of the date
		try {
			datOfBirth = dateformat.parse(DOB);// parsing the string into the specified format
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Method to display the Instance Member
	public String display() {

		LocalDate date = LocalDate.of(year, month, day);// converting given Dob to LocalDate format
		LocalDate now = LocalDate.now();// Getting the Current Date
		Period diff = Period.between(date, now);// Getting the absolute difference between dob and current date

		// Constructing the string
		String dob = "Name : " + name + "\nDate Of Birth : " + day + "/" + month + "/" + year + "\nAge :"
				+ diff.getYears() + " Years," + diff.getMonths() + " Months," + diff.getDays() + " Days.";
		;

		return dob;
	}

	// method to display the olderPerson
	public static String olderOne(Person personOne, Person personTwo) {
		String whoIsOlder;

		// Using compareTo() to compare the older person
		if (personOne.datOfBirth.compareTo(personTwo.datOfBirth) > 0) {
			whoIsOlder = personTwo.name + " is Older than " + personOne.name;
		} else if (personOne.datOfBirth.compareTo(personTwo.datOfBirth) < 0) {
			whoIsOlder = personOne.name + " is Older than " + personTwo.name;
		} else {
			whoIsOlder = personTwo.name + " and " + personOne.name + " are of same age";
		}
		return whoIsOlder;
	}
}
