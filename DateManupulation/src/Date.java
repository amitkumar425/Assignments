//This class does the comparison of two dates and also checks for the smaller date

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class Date {
	private int day,month,year;
	private java.util.Date date;

	//Parameterized constructor for initializing the values of instance member
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		String DOB = day+"/"+month+"/"+year;//creating the object for date instance member
		DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");//object for specifying the format of the date
		try {
			date=dateformat.parse(DOB);//parsing the string into the specified format
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public String toString() {
		return "Date : "+day+"/"+month+"/"+year;
	}
	
	
	//method for checking the smaller date
	public boolean isSmaller(Date date) {
		
		if(this.date.compareTo(date.date)>0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//method for calculating the difference
	public int[] difference(Date dateTwo) {
		int[] differenceOfDateArray = new int[3];
		LocalDate localDateFirst = LocalDate.of(this.year, this.month, this.day);
		LocalDate localDateTwo = LocalDate.of(dateTwo.year, dateTwo.month, dateTwo.day);
		
		Period difference = Period.between(localDateFirst, localDateTwo);
		
		differenceOfDateArray[0]=difference.getDays();
		differenceOfDateArray[1]=difference.getMonths();
		differenceOfDateArray[2]=difference.getYears();
		
		return differenceOfDateArray;
	}
	
}
