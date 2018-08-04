//Driver class for Training, PublicTraining and CorporateTraining
//It Shows the example of Polymorphism using Upcasting

public class TrainingTester {

	public static void main(String[] args) {

		// Creating the instance of child class using upcasting
		Training publictraining = new PublicTraining(155336, "Java", 5000, 50);

		// Printing the cost of training
		System.out.println("Cost of Public Training is = " + publictraining.getOrderValue());

		// Creating the instance of child class using upcasting
		publictraining = new CorporateTraining(155336, "BigData", 35000, 4);

		// Printing the cost of training
		System.out.println("Cost of Corporate Training is = " + publictraining.getOrderValue());

	}

}
