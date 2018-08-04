//Driver class for Person.java

public class PersonTester {

	public static void main(String[] args) {

		// creating the object of person
		Person personOne = new Person("Amit", 15, 12, 1995);

		// calling the display()
		String message = personOne.display();

		// printing the message returned by display()
		System.out.println(message);

		// creating the another object of person
		Person personTwo = new Person("Alfaiz", 14, 02, 1996);

		// calling the display()
		message = personTwo.display();

		// printing the message returned by display()
		System.out.println(message);

		// checking who is older by calling the static method of Person class
		message = Person.olderOne(personOne, personTwo);
		System.out.println(message);
	}

}
