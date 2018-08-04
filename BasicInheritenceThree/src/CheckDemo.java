//Driver class demonstrating the differences between various access specifiers

public class CheckDemo extends Check{

	public static void main(String[] args) {
		//creating the object of the class called Check
		Check check = new Check();
		
		//Accessing the default variable directly 
		System.out.println(i);
		
		//Accessing the public variable directly 
		System.out.println(j);
		
		//Accessing the protected  variable directly 
		System.out.println(k);
		

		//Accessing the Private variable via public methods of the Check class 
		check.disp();

	}

}
