//Class to find the one missing number from the list of n numbers 
import java.util.Scanner;

public class OneMissingNumber {
	public static void main(String[] args) {
		System.out.println("Enter the upper limit of value to be stored in the Array");
		Scanner sc = new Scanner(System.in);
		int upperLimit = sc.nextInt();//Taking the UpperLimit
		
		int[] arrayOfNumbers = new int[upperLimit];//Creating an array of size upperlimit 
		
		//Initializing the array to default value i.e. -1
		for(int i=0;i<upperLimit-1;i++) {
			arrayOfNumbers[i]=-1;
		}
		
		//Accepting the values from user
		for(int i=0;i<upperLimit-1;i++) {
			int a=sc.nextInt();
			arrayOfNumbers[a]=a; //Applying the concept of hashing to store the values in the array
		}
		
		int counter=1;//Declaring the counter for checking the entry into if case
		
		//Checking for missing values
		for(int i=0;i<upperLimit-1;i++) {
			if(arrayOfNumbers[i]==-1) {
				System.out.print("Missing Number is "+i+" ");
				counter++;
			}
		}
		
		//checking the default counter value for Not Finding the missing value 
		if(counter==1) {
			System.out.println("No Missing values");
		}
	}

}
