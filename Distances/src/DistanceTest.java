
//This is the Driver class for Distance.java.
//It takes two distance both in feet and inches format and returns them the addition of both the 
//distances by applying the appropriate shifting of inches to feet 

import java.util.Scanner;

public class DistanceTest {

	public static void main(String[] args) {

		// Creating three Distance object.
		Distance distanceNumberOne = new Distance();
		Distance distanceNumberTwo = new Distance();
		Distance distanceNumberThree = new Distance();

		Scanner scanner = new Scanner(System.in);

		// Taking two Distance as inputs
		System.out.println("Enter the First Distance");
		distanceNumberOne.set(scanner.nextInt(), scanner.nextFloat());
		System.out.println("Enter the second Distance");
		distanceNumberTwo.set(scanner.nextInt(), scanner.nextFloat());

		// Assigning sum of two to third Distance
		distanceNumberThree = Distance.add(distanceNumberOne, distanceNumberTwo);

		// printing all the Distances
		System.out.println("First Distance = " + distanceNumberOne.disp());
		System.out.println("Second Distance = " + distanceNumberTwo.disp());
		System.out.println("Third Distance = " + distanceNumberThree.disp());
	}

}
