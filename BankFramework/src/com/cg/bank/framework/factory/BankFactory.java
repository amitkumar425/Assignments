//This class is the abstraction for all the Object creation by any implementing bank. 
//This abstract class has two basic methods that needs to implemented by the inheriting class. 
package com.cg.bank.framework.factory;

import java.util.Map;

public abstract class BankFactory {

	public abstract void createNewSavingsAccount(Map<String, Object> account);

	public abstract void createNewCurrentAccount(Map<String, Object> account);

}
