//Driver class, demonstrating the use static and non-static instance members and also how 
//to access them

public class StaticAndNonSataticTester {

	public static void main(String[] args) {
		// Creating the object
		StaticAndNonStatic staticAndNonStatic = new StaticAndNonStatic();

		// calling the static instance method directly by using the class name
		StaticAndNonStatic.setStaticMember(30);
		System.out.println(StaticAndNonStatic.getStaticMember());

		// Printing the information with the help of toString()
		System.out.println(staticAndNonStatic);

		// calling the non-static instance method using the reference variable
		System.out.println(staticAndNonStatic.getNonSaticMember());
	}

}
