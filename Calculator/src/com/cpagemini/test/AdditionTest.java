//This is a JUnit test class that tests for various possible combination of Addition of two 
//numbers


package com.cpagemini.test;

import org.junit.Assert;
import org.junit.Test;

import com.cpagemini.calculator.main.Calculator;

public class AdditionTest {

	@Test
	public void testAddTwoPositive() {
		Calculator calculator = new Calculator();
		double result = calculator.add(10, 20);
		Assert.assertEquals(30, result, 0);
	}
	
	@Test
	public void testAddTwoNegatives() {
		Calculator calculator = new Calculator();
		double result = calculator.add(-10, -20);
		Assert.assertEquals(-30, result, 0);
	}
	
	@Test
	public void testAddOneGreaterNegativeAndPositive() {
		Calculator calculator = new Calculator();
		double result = calculator.add(-30, 20);
		Assert.assertEquals(-10, result, 0);
	}
	
	@Test
	public void testAddNegativeAndOneGreaterPositive() {
		Calculator calculator = new Calculator();
		double result = calculator.add(-10, 20);
		Assert.assertEquals(10, result, 0);
	}

}
