//This jUnit class tests the name of the employee if it is empty or null.

package com.capgemini.tax.test;
import org.junit.Assert;
import org.junit.Test;
import com.capgemini.tax.TaxCalculator;
import com.capgemini.tax.exception.CountryNotValidException;
import com.capgemini.tax.exception.EmployeeNameInvalidException;
import com.capgemini.tax.exception.TaxNotEligibleException;

public class EmployeeNameTest {

	@Test
	public void testEmployeName() {
		EmployeeNameInvalidException empName = new EmployeeNameInvalidException();
		Exception exp = new Exception();
		TaxCalculator taxCalculator = new TaxCalculator();
		try {
			taxCalculator.calculateTax(null, true, 55000);
		} catch (CountryNotValidException e) {
			exp = e;
		} catch (EmployeeNameInvalidException e) {
			exp = e;
		} catch (TaxNotEligibleException e) {
			exp = e;
		}
		System.out.println(exp);
		Assert.assertEquals(empName.getClass().getSimpleName(),exp.getClass().getSimpleName());
	}

}
