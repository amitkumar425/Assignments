//This class calculates the Factorial of given number and also throws the Exception as and when asked.

package com.capgemini.factorial;

import com.capgemini.exception.FactorialException;
import com.capgemini.exception.InvalidInputException;

public class CalculateFactorial {
	private static int MAX_VALUE=2147483647;
	private int number;

	public int getNumber() {
		return number;
	}

	//This method return the factorial or throws the exception as and when required 
	public long getFactorial(int number) throws FactorialException, InvalidInputException {
		long result = 1;
		if (number < 2) {
			throw new InvalidInputException("Number less than 2");
		}
		for (int i = 2; i <= number; i++) {
			result *= i;
		}
		if (result > 2147483647) {
			throw new FactorialException("Factorial exceeds the integer range");
		} else {
			return result;
		}
	}
}
