//This is the only class. 
//This class checks the existence of the file, path of which is provided by the user.

package com.capgemini.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileExistTester {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter the Complete File Path");

		//Scanner object created to take the input from the user.
		Scanner scanner = new Scanner(System.in);
		String path = scanner.nextLine();

		// Logic for checking if the file is available or not.
		File file = new File(path);
		boolean exist = file.canRead();
		if (exist == true && !file.isDirectory()) {
			System.out.println("The File Exists.");
		} else {
			System.out.println("The File doesn't exists.");
		}

		// A java LineCount Application.
		// logic to count the number of lines in the file provided by the user.
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		String string = null;
		int numberOfLine = 0;
		string = bufferReader.readLine();
		do {
			numberOfLine++;
			string = bufferReader.readLine();
		} while (string != null);
		System.out.println("Number of lines in the file = " + numberOfLine);

		
		// A java Word Count Application.
		//Logic to match the words taken from the user from the file.
		FileReader fileReaderTwo = new FileReader(path);
		BufferedReader bufferReaderTwo = new BufferedReader(fileReaderTwo);
		int numberOfWords = 0;

		while (bufferReaderTwo.readLine() != null) {
			String[] str = bufferReaderTwo.readLine().split(" ");
			numberOfWords += str.length;
			numberOfWords++;
		}
		System.out.println("Number of Words in the file = " + numberOfWords);

		
		// A java grep program.
		String searchWord = args[0];
		path = args[1];
		FileReader fileReaderThree = new FileReader(path);
		BufferedReader bufferReaderThree = new BufferedReader(fileReaderThree);
		String line;
		int linenumber=0;
		while (bufferReaderThree.readLine() != null) {
			linenumber++;
			line = bufferReaderThree.readLine();
			if(line.contains(searchWord)) {
				System.out.println("Line number = "+linenumber);
				System.out.println("Line = "+line);
			}
		}
	}

}
