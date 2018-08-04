//Driver class for implementing Television.java

public class TelevisionTester {

	public static void main(String[] args) {
		// Creating the Television State
		Television television = new Television();

		// Switching on the television
		System.out.println(television.onOff());

		// Increasing the volume
		television.increaseVolume();
		television.increaseVolume();
		television.increaseVolume();
		System.out.println("Volume = " + television.getCurrentVolume());

		// Decreasing the volume
		television.decreaseVolume();
		System.out.println("Volume = " + television.getCurrentVolume());

		// Changing the channel
		television.changeChannel(100);
		System.out.println("Channel = " + television.getCurrentChannel());

		// Switching OFF the television
		System.out.println(television.onOff());
	}

}
