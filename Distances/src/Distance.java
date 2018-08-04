//This class has several instance members and methods used for addition 
//of two distances and displaying them in correct format 

public class Distance {
	private int feet;
	private float inches;

	// methods to set the values
	public void set(int feet, float inches) {
		this.feet = feet;
		this.inches = inches;
	}

	// methods to display
	public String disp() {
		String distance = Integer.toString(feet) + " feet and " + Float.toString(inches) + " inche";
		return distance;
	}

	// Method to add two distances
	public static Distance add(Distance distanceOne, Distance distanceTwo) {
		Distance distance = new Distance();
		distance.inches = distanceOne.inches + distanceTwo.inches;
		distance.feet = distanceOne.feet + distanceTwo.feet;
		if (distance.inches > 12) {
			float newInches = distance.inches % 12;
			distance.feet += distance.inches / 12;
			distance.inches = newInches;
		}
		return distance;
	}
}
