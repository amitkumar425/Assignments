//This is the Driver Class implementing the ParkedCarOwnerDetails.java and 
//ParkedCarOwnerList.java class files.
//It creates the objects of ParkedCarOwnerDetails and adds it to the ParkedCarOwnerList.
//After Adding it also performs various operations on the ParkedCarOwnerList object.

package com.capgemini.parking;

import com.capgemini.parking.exception.CarNotFoundException;
import com.capgemini.parking.exception.InvalidTokenException;
import com.capgemini.parking.exception.ParkingAreaNotAvailableException;

public class ParkingTester {

	public static void main(String[] args) {

		// Creating the objects of ParkedCarOwnerDetails with different car number
		ParkedCarOwnerDetails personOne = new ParkedCarOwnerDetails("Amit", "Suv TZ", "MH A20 4586", 9430625920l,
				"ABC");
		ParkedCarOwnerDetails personTwo = new ParkedCarOwnerDetails("Amit", "Suv TZ", "MH A20 4587", 9430625920l,
				"ABC");
		ParkedCarOwnerDetails personThree = new ParkedCarOwnerDetails("Amit", "Suv TZ", "MH A20 4588", 9430625920l,
				"ABC");
		ParkedCarOwnerDetails personFour = new ParkedCarOwnerDetails("Amit", "Suv TZ", "MH A20 4589", 9430625920l,
				"ABC");
		ParkedCarOwnerDetails personFive = new ParkedCarOwnerDetails("Amit", "Suv TZ", "MH A20 4589", 9430625920l,
				"ABC");

		// Creating the object of ParkedCarOwnerList to maintain the ArrayList of car.
		ParkedCarOwnerList list = new ParkedCarOwnerList();

		// Adding the created objects to the list.
		try {
			int token = list.addNewCar(personOne);
			System.out.println("Your token no for Car numbered  :- " + personOne.getCarNO() + " is " + token);
			token = list.addNewCar(personTwo);
			System.out.println("Your token no for Car numbered  :- " + personTwo.getCarNO() + " is " + token);
			token = list.addNewCar(personThree);
			System.out.println("Your token no for Car numbered  :- " + personThree.getCarNO() + " is " + token);
			token = list.addNewCar(personFour);
			System.out.println("Your token no for Car numbered  :- " + personFour.getCarNO() + " is " + token);
		} catch (ParkingAreaNotAvailableException e) {
			e.printStackTrace();
		}

		// Trying to remove one of the car objects added previously.
		try {
			list.removeCar(personFour);
		} catch (CarNotFoundException e) {
			e.printStackTrace();
		}

		// trying the get the location of the car removed earlier to observe the
		// Exception thrown.
		try {
			int address = list.getParkedCarLocation(3);
			System.out.println("Address of the parked Car is = " + address);
		} catch (InvalidTokenException e) {
			e.printStackTrace();
		}
	}
}
