//Driver class for testing the working of Game,football,cricket,and tennis

public class GameTester {

	public static void main(String[] args) {
		// Creating the reference of game interface
		Game game;

		// Creating Object of Cricket
		game = new Cricket();
		game.play();

		// Creating Object of Football
		game = new FootBall();
		game.play();

		// Creating Object of Tennis
		game = new Tennis();
		game.play();
	}

}
