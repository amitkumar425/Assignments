//This is the only class.
//It finds the given name from the array of names and returns the position and total 
//occurrence of that name in the array. 

import java.util.Scanner;

public class FindName {

	public static void main(String[] args) {
		int counter=0; //To Check the Entry into if block
		
		//Array of Names Declared and Initialized 
		String[] arrayOfNames = new String[] {
			"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Marry","Sam","Ayan","Dev","Kitty",
			"Meery","Smith","Johnson","Bill","Sam","Williams","Jones","Brown","Davis","Sam"
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to be Searched");
		
		//Taking the name to be searched
		String nameToBeSearched = sc.nextLine();
		
		//Looping for searching the name
		for(int i=0;i<arrayOfNames.length;i++) {
			if(arrayOfNames[i].equals(nameToBeSearched)) {
				counter++;
				System.out.println("Name found at position "+(i+1));
			}
		}
		
		//Condition for no match found
		if(counter==0) {
			System.out.println("Name Not found");
			java.lang.System.exit(0);
		}
		
		//Printing the Total Occurrences of the name to be searched
		System.out.println("Total number of Occurences of "+nameToBeSearched+" is "+counter);
	}

}
