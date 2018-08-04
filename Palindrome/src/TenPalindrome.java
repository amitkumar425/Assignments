//this is the only class.
//It accepts the 10 words from the user and finds the palindrome from those words and display 
// them along with their character count and  sorted order of their characters.

import java.util.*;
import java.util.Arrays;
public class TenPalindrome {
	//Methods for sorting the string
	  public static StringBuilder sortString(String inputString) 
	    {
	        // convert input string to char array
	        char tempArray[] = inputString.toCharArray();
	         
	        // sort tempArray
	        Arrays.sort(tempArray);
	         
	        // return new sorted string
	        return new StringBuilder(new String(tempArray)).reverse() ;
	    }
	
	public static void main(String[] args) {
		
		//creating the scanner Object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 words");
		
		//creating the Array of StringBuilder to store the 10 words
		StringBuilder[] strings = new StringBuilder[10];
		
		//Accepting the inputs from the users
		for(int i=0;i<10;i++) {
			strings[i]=new StringBuilder(sc.nextLine());
		}
		
		System.out.println("Palindromes  CharacterCount SortedStrings");

		//Displaying the result in above printed format.
		for(int i=0;i<10;i++) {
			if(new String(strings[i]).equals(new String(strings[i].reverse()))) {//condition for checking the Palindrome
				System.out.print(strings[i]+" "+strings[i].length()+" ");// Printing the Palindrome and the character of it
				System.out.println(sortString(new String(strings[i])));//Sorting the palindrome string and printing it
			}
		}
	}
}
