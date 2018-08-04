//Driver class Showing the creation of objects via constructor with  different number of parameters

public class SubTester {

	public static void main(String[] args) {

		// Object of Ctar.. with 0 parameters
		SubOne subOne = new SubOne();
		System.out.println(subOne);

		// Object of Ctar.. with 2 parameters
		subOne = new SubOne(20, 40);
		System.out.println(subOne);

		// Object of Ctar.. with 3 parameters
		subOne = new SubOne(50, 50, 100);
		System.out.println(subOne);

	}

}
