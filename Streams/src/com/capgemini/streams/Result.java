//This class is the only class.
//This class opens/Creates the boy.txt file and writes 100 numbers randomly from 1-49.
//It then Removes the duplicates from the written number , sorts it and displays it back onto 
//the console screen. 

package com.capgemini.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Result {

	public static void main(String[] args) throws IOException {
		
		File file = new File("boy.txt");
		
		//File writer object to write into the file.
		FileWriter fileWriter = new FileWriter(file);
		
		//Writing random numbers one per line into the file.
		for(int i=0;i<100;i++) {
			String string = Integer.toString((int)(Math.random()*(49-1)));
			fileWriter.write(string+"\r\n");
		}
		
		//Closing the file.
		fileWriter.close();
		
		
		System.out.println("Written Success");
		
		//Taking a collection called TreeSet.
		Set<Integer> treeSet = new TreeSet<Integer>();
		
		//FileReader object to read from the file.
		FileReader fileReader = new FileReader(file);
		
		//In order to read the Line in one go we create the object of BufferedReader.
		BufferedReader bufferReader = new BufferedReader(fileReader);
		String line;
		
		//Reading one line per iteration and adding it to the treeSet.
		while((line = bufferReader.readLine())!=null) {
			treeSet.add(Integer.valueOf(line));
		}
		
		//Displaying the added numbers from the treeSet .
		//TreeSet sorts it and also remove the duplicates from it. 
		treeSet.stream().forEach(i->System.out.println(i));
		
		//Closing the bufferedReader object.
		bufferReader.close();
		fileReader.close();
	}

}
