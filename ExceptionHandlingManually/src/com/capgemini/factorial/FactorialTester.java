package com.capgemini.factorial;

import com.capgemini.exception.FactorialException;
import com.capgemini.exception.InvalidInputException;

public class FactorialTester {

	public static void main(String[] args) {
		int number = 20;
		CalculateFactorial calculateFactorial = new CalculateFactorial();
		try {
			long result = calculateFactorial.getFactorial(number);
			System.out.println("The Factorial of " + number + " is = " + result);
		} catch (FactorialException e) {
			e.printStackTrace();
		} catch (InvalidInputException e) {
			e.printStackTrace();
		}
	}
}
