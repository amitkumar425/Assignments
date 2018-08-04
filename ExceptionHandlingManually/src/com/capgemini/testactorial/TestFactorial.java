package com.capgemini.testactorial;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.exception.FactorialException;
import com.capgemini.exception.InvalidInputException;
import com.capgemini.factorial.CalculateFactorial;


public class TestFactorial {

	@Test
	public void testFactorialOfNegative() {
		InvalidInputException invalidExcp = new InvalidInputException("Number less than 2");
		Exception e = new Exception();
		CalculateFactorial calculateFactorial = new CalculateFactorial();
		try {
			long result = calculateFactorial.getFactorial(-20);
		} catch (InvalidInputException | FactorialException excep) {
			e = excep;
			excep.printStackTrace();
		}
		Assert.assertEquals(invalidExcp.getClass().getSimpleName(), e.getClass().getSimpleName());
	}
	@Test
	public void testFactorialExceedingIntegerRange() {
		FactorialException factorialExcp = new FactorialException("Factorial exceeds the integer range");
		Exception e = new Exception();
		CalculateFactorial calculateFactorial = new CalculateFactorial();
		try {
			long result = calculateFactorial.getFactorial(20);
		} catch (InvalidInputException | FactorialException excep) {
			e = excep;
			excep.printStackTrace();
		}
		Assert.assertEquals(factorialExcp.getClass().getSimpleName(), e.getClass().getSimpleName());
	}
	@Test
	public void testFactorialOfValidInput() throws Exception{
		CalculateFactorial calculateFactorial = new CalculateFactorial();
			long result = calculateFactorial.getFactorial(5);
			Assert.assertEquals(120, result,0);
	}

}
