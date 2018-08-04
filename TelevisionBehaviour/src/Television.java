//Television Class implements the various behaviour of the television such as 
//Switching off/on ,increasing/decreasing the volume, changing the channel.

public class Television {
	private String state = "OFF";// Representing whether the television is ON/OFF
	private int currentVolume = 0;
	private int currentChannel = 0;

	// to increase the volume of the television
	public void increaseVolume() {
		currentVolume += 1;
	}

	// to decrease the volume of the television
	public void decreaseVolume() {
		currentVolume -= 1;
	}

	public String getState() {
		return state;
	}

	// for displaying the current volume
	public int getCurrentVolume() {
		return currentVolume;
	}

	// for displayimg the curren channel
	public int getCurrentChannel() {
		return currentChannel;
	}

	// for changing the channel
	public void changeChannel(int channel) {
		currentChannel = channel;
	}

	// for switching on/off the television
	public String onOff() {
		if (state.equals("OFF")) {
			state = "ON";
			return "Turned ON";
		} else {
			state = "OFF";
			return "Turned OFF";
		}
	}

}
