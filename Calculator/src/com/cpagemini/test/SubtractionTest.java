//This is a JUnit test class that tests for various possible combination of Subtraction of two 
//numbers


package com.cpagemini.test;

import org.junit.Assert;
import org.junit.Test;

import com.cpagemini.calculator.main.Calculator;

public class SubtractionTest {

	@Test
	public void testSubtractTwoPositive() {
		Calculator calculator = new Calculator();
		double result = calculator.subtract(10, 20);
		Assert.assertEquals(-10, result, 0);
	}
	
	@Test
	public void testSubtractTwoNegatives() {
		Calculator calculator = new Calculator();
		double result = calculator.subtract(-10, -20);
		Assert.assertEquals(10, result, 0);
	}
	
	@Test
	public void testSubtractGreaterFromSmaller() {
		Calculator calculator = new Calculator();
		double result = calculator.subtract(30, 40);
		Assert.assertEquals(-10, result, 0);
	}
	
	@Test
	public void testSubtractSmallerFromGreater() {
		Calculator calculator = new Calculator();
		double result = calculator.subtract(30, 20);
		Assert.assertEquals(10, result, 0);
	}

}
