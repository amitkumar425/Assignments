
//Driver class for implementing the class called Time.java

import java.util.Scanner;

public class TimeTest {

	public static void main(String[] args) {

		// Creating three Time object.
		Time TimeNumberOne = new Time();
		Time TimeNumberTwo = new Time();
		Time TimeNumberThree = new Time();

		Scanner scanner = new Scanner(System.in);

		// Taking two Time as inputs
		System.out.println("Enter the First Time");
		TimeNumberOne.setTime(scanner.nextInt(), scanner.nextInt());
		System.out.println("Enter the second Time");
		TimeNumberTwo.setTime(scanner.nextInt(), scanner.nextInt());

		// Assigning sum of two to third Time
		TimeNumberThree = Time.sum(TimeNumberOne, TimeNumberTwo);

		// printing all the Time
		System.out.println("First Time  = " + TimeNumberOne.showTime());
		System.out.println("Second Time  = " + TimeNumberTwo.showTime());
		System.out.println("Third Time = " + TimeNumberThree.showTime());

	}

}
