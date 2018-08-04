//This is the only class.
//This class sorts the list of files and directory in such a way that directory 
//comes before the file and every thing is sorted alphabetically.

package com.capgemini.lambdaexpression;

import java.io.File;
import java.util.Set;
import java.util.TreeSet;

public class SortingArrayOfFile {

	public static void main(String[] args) {
		// Assigning the valid directory name to a string variable.
		String directory = "P:\\Users\\akuma425\\sts-bundle\\sts-3.9.5.RELEASE";

		// Creating the file object to perform operation on.
		File file = new File(directory);

		// Creating the list of file objects.
		File[] arrayOfFileObjects = file.listFiles();

		// Creating a TreeSet by passing the Lambda Expression in its constructor.
		Set<File> setOfFiles = new TreeSet<File>((file1, file2) -> {
			if (file1.isDirectory() && file2.isFile()) {
				return -1;
			} else {
				return file1.compareTo(file2);
			}
		});

		// Adding the files into the treesSet.
		for (File f : arrayOfFileObjects) {
			setOfFiles.add(f);
		}

		// Displaying the content of the treeSet with the help of forEach().
		setOfFiles.stream().forEach(System.out::println);
	}

}
