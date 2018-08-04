//This class performs the operation like addition of two time objects 
//and displaying the current time.

public class Time {
	private int hours;
	private int minutes;

	// This class Sets the values of Instance member
	public void setTime(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	// to display the time
	public String showTime() {
		String time = Integer.toString(hours) + " : " + Integer.toString(minutes);
		return time;
	}

	// Function to return the sum of two time objects
	public static Time sum(Time timeOne, Time timeTwo) {
		Time time = new Time();
		time.hours = timeOne.hours + timeTwo.hours;
		time.minutes = timeOne.minutes + timeTwo.minutes;
		if (time.minutes >= 60) {
			int resultantMinute = time.minutes % 60;
			time.hours += time.minutes / 60;
			time.minutes = resultantMinute;
		}
		return time;
	}
}
