//This class maintains the ArrayList of parked car.
package com.capgemini.parking;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.parking.exception.CarNotFoundException;
import com.capgemini.parking.exception.InvalidTokenException;
import com.capgemini.parking.exception.ParkingAreaNotAvailableException;

public class ParkedCarOwnerList {
	// Total capacity of parkingArea
	private static final int TOTAL_AVALAIBLE_SPACE = 240;

	// Creating the reference of the List
	private List parkingArea;

	public List getParkingArea() {
		return parkingArea;
	}

	// Instance member denoting the number of available slots for parking at any
	// point of time
	private int numberOfParkingSlotsAvailable = 240;

	// No-Arg Constructor Creating the ArrayList.
	public ParkedCarOwnerList() {
		parkingArea = new ArrayList(TOTAL_AVALAIBLE_SPACE);
		for (int i = 0; i < TOTAL_AVALAIBLE_SPACE; i++) {
			parkingArea.add(i, ParkedCarOwnerDetails.checkingObject);
		}
	}

	// Method to add new car to the parking area.
	public int addNewCar(ParkedCarOwnerDetails parkedCarOwnerDetails) throws ParkingAreaNotAvailableException {
		int token;
		if (numberOfParkingSlotsAvailable == 0) {
			throw new ParkingAreaNotAvailableException("Not Enough Space For Parking");
		} else {
			for (int i = 0; i < parkingArea.size(); i++) {
				if (parkingArea.get(i).equals(ParkedCarOwnerDetails.checkingObject)) {
					parkingArea.add(i, parkedCarOwnerDetails);
					token = parkingArea.indexOf(parkedCarOwnerDetails);
					numberOfParkingSlotsAvailable--;
					return token + 1;
				}
			}
			numberOfParkingSlotsAvailable--;
			throw new ParkingAreaNotAvailableException("Not Enough Space For Parking");
		}
	}

	// Method to remove the parked car from the parking area.
	public void removeCar(ParkedCarOwnerDetails parkedCarOwnerDetails) throws CarNotFoundException {
		int index = parkingArea.indexOf(parkedCarOwnerDetails);
		if (index == -1 || numberOfParkingSlotsAvailable == 240) {
			throw new CarNotFoundException("Unable to find Car with the given Details.");
		} else {
			parkingArea.remove(parkedCarOwnerDetails);
			parkingArea.add(index, ParkedCarOwnerDetails.checkingObject);
			numberOfParkingSlotsAvailable++;
		}
	}

	// method to get the location of the parked car
	public int getParkedCarLocation(int token) throws InvalidTokenException {
		if (parkingArea.get(token - 1).equals(ParkedCarOwnerDetails.checkingObject) || token < 0) {
			throw new InvalidTokenException("Invalid Token Number !");
		} else if (parkingArea.get(token - 1).getClass().getSimpleName().equals("ParkedCarOwnerDetails")) {
			return parkingArea.get(token - 1).hashCode();
		} else {
			throw new InvalidTokenException("Invalid Token Number !!");
		}
	}
}
