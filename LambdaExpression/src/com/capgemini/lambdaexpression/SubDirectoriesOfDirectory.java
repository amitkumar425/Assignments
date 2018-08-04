////This is the only class.
//This class lists all the subdirectories from a given directory. 

package com.capgemini.lambdaexpression;

import java.io.File;

public class SubDirectoriesOfDirectory {

	public static void main(String[] args) {

		// Assigning the valid directory name to a string variable.
		String directory = "P:\\Users\\akuma425\\Code\\akuma425\\30_07_2018\\AdvanceCollectionFourMMBank";
		
		// Creating the file object to perform operation on.
		File file = new File(directory);

		// listFiles() takes reference of FileFilter which is a functionalInterface.
		// FileFilter has one abstract method with signature "boolean accept(File f)".
		for (File subDirectory : file.listFiles(f -> f.isDirectory())) {
			System.out.println(subDirectory.getName());
		}
	}

}
