//This jUnit class tests the Country of the employee if it is India and checks for the given Exception class

package com.capgemini.tax.test;
import org.junit.Assert;
import org.junit.Test;

import com.capgemini.tax.TaxCalculator;
import com.capgemini.tax.exception.CountryNotValidException;
import com.capgemini.tax.exception.EmployeeNameInvalidException;
import com.capgemini.tax.exception.TaxNotEligibleException;

public class CountryNameTest {

	@Test
	public void testCountryName() {
		CountryNotValidException countryName = new CountryNotValidException();
		Exception exp = new Exception();
		TaxCalculator taxCalculator = new TaxCalculator();
		try {
			taxCalculator.calculateTax("Amit", false, 55000);
		} catch (CountryNotValidException e) {
			exp = e;
		} catch (EmployeeNameInvalidException e) {
			exp = e;
		} catch (TaxNotEligibleException e) {
			exp = e;
		}
		System.out.println(exp);
		Assert.assertEquals(countryName.getClass().getSimpleName(), exp.getClass().getSimpleName());
	}

}
