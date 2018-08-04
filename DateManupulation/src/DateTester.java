//Driver class that runs the Date.java and does the manipulation on the provided date and gives 
//back the result of comparison of the given dates 

public class DateTester {

	public static void main(String[] args) {

		// creating two objects
		Date dateOne = new Date(15, 12, 1995);
		Date dateTwo = new Date(14, 02, 1996);

		// printing the attribute of both objects using toString()
		System.out.println(dateOne.toString());
		System.out.println(dateTwo.toString());

		// Getting the difference of both the date in integer Array
		int[] difference = dateOne.difference(dateTwo);
		System.out.println("There is a defference of \nDays : " + difference[0] + "\nMonth : " + difference[1]
				+ "\nYears : " + difference[2]);

		// testing isSmaller()
		boolean smaller = dateOne.isSmaller(dateTwo);
		if (smaller == true) {
			System.out.println("First date is Smaller than Second");
		} else {
			System.out.println("Second Date is Smaller than first");
		}
	}

}
