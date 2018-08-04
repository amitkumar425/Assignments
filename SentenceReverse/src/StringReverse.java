
//This is the only class.
//it reverses the given String and Prints it back

import java.util.*;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");

		// taking the input from the user
		String sentence = sc.nextLine();

		String[] toCharacterArray = sentence.split(" ");// For Splitting the Sentence into words

		for (int i = 0; i < toCharacterArray.length; i++) {
			StringBuilder str = new StringBuilder(toCharacterArray[i]);// converting Each words(String) into
																		// StringBuilder to be able to use reverse.
			System.out.print(str.reverse() + " ");
		}
	}
}
