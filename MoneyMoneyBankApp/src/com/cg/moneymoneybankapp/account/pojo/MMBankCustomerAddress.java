//this class maintains the address of the customer.
//It has various instance members related to address and the corresponding getters and setters.

package com.cg.moneymoneybankapp.account.pojo;

import com.cg.bank.framework.account.pojo.Address;

public class MMBankCustomerAddress extends Address {

	public MMBankCustomerAddress(String houseNo, String street, String city, String state, int pinCode) {
		super(houseNo, street, city, state, pinCode);
	}

}
