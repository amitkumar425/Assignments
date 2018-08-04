//Program to test the Command line arguments
public class CommandLineTester {

	public static void main(String[] args) {
		double sum = 0;// variable to store the final value of addition

		// Loop for accessing the entire value passed from the command line
		for (int i = 0; i < args.length; i++) {
			sum += Double.parseDouble(args[i]);
		}

		// Printing the final result
		System.out.println("The sum is = " + sum);
	}

}
