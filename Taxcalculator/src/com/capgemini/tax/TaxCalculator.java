//This is the Class containing the logic for tax calculator 

package com.capgemini.tax;
import com.capgemini.tax.exception.CountryNotValidException;
import com.capgemini.tax.exception.EmployeeNameInvalidException;
import com.capgemini.tax.exception.TaxNotEligibleException;

public class TaxCalculator {

	public double calculateTax(String empName, boolean isIndian, int salary) throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException{
		double tax=0;
		if(empName==null || empName.isEmpty()) {
			throw new EmployeeNameInvalidException();
		}
		else if(salary<=10000){
			throw new TaxNotEligibleException();
		}
		else if(isIndian==false) {
			throw new CountryNotValidException();
		}
		else if(salary>100000 && isIndian==true){
			tax = salary*(8/100);
			return tax;
		}
		else if(salary>50_000 && salary<=1_00_000) {
			tax = salary*(6/100);
			return tax;
		}
		else if(salary>30_000 && salary<=50_000) {
			tax = salary*(5/100);
			return tax;
		}
		else {
			tax = salary *(4/100);
			return tax;
		}
	}

}
