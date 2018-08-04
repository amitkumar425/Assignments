//This is the only class.
//This class removes the Duplicates and Extra spaces from the given string 

import java.util.Scanner;

public class RemoveDuplicatesAndExtraSpace {

	public static void main(String[] args) {

		System.out.println("Enter the Sentence");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();

		// Splitting the sentence into at " "
		String[] arrayOfWords = sentence.split(" ");

		// Removing any further Space in the individual words
		for (int i = 0; i < arrayOfWords.length; i++) {
			String sentenceByIndex = new String(arrayOfWords[i]);
			// StringBuilder wordWithoutExtraSpace = new StringBuilder();
			String wordWithoutExtraSpace = "";
			for (int j = 0; j < sentenceByIndex.length(); j++) {
				if (sentenceByIndex.charAt(j) == ' ') {
					continue;
				} else {
					wordWithoutExtraSpace += sentenceByIndex.charAt(j);
				}
			}
			arrayOfWords[i] = wordWithoutExtraSpace;
		}

		// Replacing Duplicates with Double Space For identification
		for (int i = 0; i < arrayOfWords.length; i++) {
			for (int j = i + 1; j < arrayOfWords.length; j++) {

				if (arrayOfWords[i].equals(arrayOfWords[j])) {
					arrayOfWords[j] = "  ";
				}
			}
		}

		// Printing the Final Sentence
		for (int i = 0; i < arrayOfWords.length; i++) {
			if (arrayOfWords[i].equals("  ")) {
				continue;
			} else {
				System.out.print(arrayOfWords[i] + " ");
			}
		}
	}
}
