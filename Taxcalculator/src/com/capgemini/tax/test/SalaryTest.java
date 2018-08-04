//This jUnit class tests the Salary of the employee if it is <10000 and checks for the given Exception class.

package com.capgemini.tax.test;
import org.junit.Assert;
import org.junit.Test;

import com.capgemini.tax.TaxCalculator;
import com.capgemini.tax.exception.CountryNotValidException;
import com.capgemini.tax.exception.EmployeeNameInvalidException;
import com.capgemini.tax.exception.TaxNotEligibleException;

public class SalaryTest {

	@Test
	public void testSalary() {
		TaxNotEligibleException taxExcp = new TaxNotEligibleException();
		Exception exp = null;
		TaxCalculator taxCalculator = new TaxCalculator();
		try {
			taxCalculator.calculateTax("Amit", true, 1000);
		} catch (CountryNotValidException e) {
			exp = e;
		} catch (EmployeeNameInvalidException e) {
			exp = e;
		} catch (TaxNotEligibleException e) {
			exp = e;
		}
		System.out.println(exp);
		Assert.assertEquals(taxExcp.getClass().getSimpleName(), exp.getClass().getSimpleName());
	}

}
