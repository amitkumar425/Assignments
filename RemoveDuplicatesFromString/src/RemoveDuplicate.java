
//This is the only class.
//This class removes the Duplicates from the given string 

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		System.out.println("Enter a String");

		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();// Taking a string

		// Converting the string to array of characters.
		char[] stringToCharArray = string.toCharArray();

		// Assigning the ' ', where the duplicates are found
		for (int i = 0; i < string.length(); i++) {
			for (int j = i + 1; j < string.length(); j++) {
				if (stringToCharArray[i] == stringToCharArray[j]) {
					stringToCharArray[j] = ' ';
				}
			}
		}

		// checking for ' ' and skiping the indices where found and printing the rest
		// which results in the removal of duplicates from the strings
		for (int i = 0; i < string.length(); i++) {
			if (stringToCharArray[i] == ' ') {
				continue;
			} else {
				System.out.print(stringToCharArray[i]);
			}
		}
	}

}
