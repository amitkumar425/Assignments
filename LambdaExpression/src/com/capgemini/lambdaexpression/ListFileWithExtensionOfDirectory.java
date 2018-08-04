//This is the only class.
//This class lists the files from a given directory ending with a given extension.
//It uses the lambda expression

package com.capgemini.lambdaexpression;

import java.io.File;
import java.io.IOException;

public class ListFileWithExtensionOfDirectory {

	public static void main(String[] args) throws IOException {

		// Assigning the valid directory name to a string variable.
		String directory = "P:\\Users\\akuma425\\Code\\akuma425\\30_07_2018\\AdvanceCollectionFourMMBank\\src\\com\\capgemini\\advancecollection\\mmbank";

		// Creating the file object to perform operation on.
		File file = new File(directory);
		
		// listFiles() takes reference of FileFilter which is a functionalInterface.
		// This functional interface has one abstract method with signature "boolean accept(File f)".
		for (File fi : file.listFiles(f->f.isFile())) {
			if (fi.getCanonicalFile().getName().endsWith(".java")) {
				System.out.println(fi);
			}

		}
	}
}
