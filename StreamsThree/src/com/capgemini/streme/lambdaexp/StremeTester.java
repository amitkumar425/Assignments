//This is the only class.
//This class display the odd, even, divisible by 6, less than 12 and greater than 50 from 
//a list of 1-100 numbers from a array list.

//it uses Lambda expression to do so.
package com.capgemini.streme.lambdaexp;

import java.util.ArrayList;
import java.util.List;

public class StremeTester {
	public static void main(String args[]) {

		// Creating the ArrayList to store the integers.
		List<Integer> listOfNumbers = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			listOfNumbers.add(i);
		}

		// Listing the integers of the list using the lambda expression.
		listOfNumbers.stream().forEach(System.out::println);

		// Listing all the even numbers in the list.
		System.out.println("Even numbers");
		listOfNumbers.stream().filter(num -> num % 2 == 0 ? true : false).forEach(System.out::println);

		// Displaying all the odd numbers in the list.
		System.out.println("Odd numbers");
		listOfNumbers.stream().filter(num -> num % 2 == 0 ? false : true).forEach(System.out::println);

		// Displaying all the numbers divisible by 6 in the list.
		System.out.println("Divisible by 6");
		listOfNumbers.stream().filter(num -> num % 6 == 0 ? true : false).forEach(System.out::println);

		// Displaying all the numbers that are less than 12.
		System.out.println("Less than 12");
		listOfNumbers.stream().filter(num -> num < 12 ? true : false).forEach(System.out::println);

		// Displaying all the numbers that are greater than 50.

		System.out.println("Greater than 50");
		listOfNumbers.stream().filter(num -> num > 50 ? true : false).forEach(System.out::println);
	}
}
