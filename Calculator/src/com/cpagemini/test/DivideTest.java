//This is a JUnit test class that tests for various possible combination of addition of two 
//numbers

package com.cpagemini.test;

import org.junit.Assert;
import org.junit.Test;

import com.cpagemini.calculator.main.Calculator;

public class DivideTest {

	@Test
	public void testDivideTwoPositive() {
		Calculator calculator = new Calculator();
		double result = calculator.divide(40, 30);
		Assert.assertEquals(1.333333, result, .01);
	}

	@Test
	public void testDivideTwoNegative() {
		Calculator calculator = new Calculator();
		double result = calculator.divide(-40, -30);
		Assert.assertEquals(1.3333333, result, .01);
	}

	@Test
	public void testDivideZeroByNonZero() {
		Calculator calculator = new Calculator();
		double result = calculator.divide(0, 30);
		Assert.assertEquals(0, result, 0);
	}

	@Test
	public void testDivideNonZeroByZero() {
		Calculator calculator = new Calculator();
		double result = calculator.divide(30, 0);
		Assert.assertEquals(Double.POSITIVE_INFINITY, result, 0);
	}

	@Test
	public void testDivideZeroByZero() {
		Calculator calculator = new Calculator();
		double result = calculator.divide(0, 0);
		Assert.assertEquals(Double.NaN, result, 0);
	}

}
