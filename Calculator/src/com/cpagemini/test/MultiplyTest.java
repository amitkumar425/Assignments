//This is a JUnit test class that tests for various possible combination of Multiplication of two 
//numbers

package com.cpagemini.test;


import org.junit.Assert;
import org.junit.Test;

import com.cpagemini.calculator.main.Calculator;

public class MultiplyTest {

	@Test
	public void testMultiplyTwoPositive() {
		Calculator calculator = new Calculator();
		double result = calculator.Multiply(10, 20);
		Assert.assertEquals(200, result, 0);
	}
	
	@Test
	public void testMultiplyTwoZero() {
		Calculator calculator = new Calculator();
		double result = calculator.Multiply(0, 0);
		Assert.assertEquals(0, result, 0);
	}

	
	@Test
	public void testMultiplyOneZeroAndAnotherNonZero() {
		Calculator calculator = new Calculator();
		double result = calculator.Multiply(10, 0);
		Assert.assertEquals(0, result, 0);
	}
	
	
	@Test
	public void testMultiplyTwoNegatives() {
		Calculator calculator = new Calculator();
		double result = calculator.Multiply(-10, -20);
		Assert.assertEquals(200, result, 0);
	}

}
