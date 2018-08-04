//This class has three methods namely isOdd, IsPrime, isPallindrome.
//All the methods are implemented by using lambda Expression.
package com.capgemini.stream.lambdaexpression;

import java.util.function.Predicate;

public class MethodsUsingLambdaExpression {

	//method to check if the number is odd or not. 
	public static Predicate<Integer> isOdd() {
		Predicate<Integer> predicate = num -> num % 2 == 0 ? false : true;
		return predicate;
	}

	//method to check if the number is prime or not.
	public static Predicate<Integer> isPrime() {
		Predicate<Integer> predicate = num-> {
				for(int i=2;i<num/2;i++)
					if(num%i==0)
						return false;
				return true;
				
		};
		return predicate;
	}

	//method to check if the number is Palindrome or not.
	public static Predicate<Integer> isPalindrome() {
		Predicate<Integer> predicate = num ->{
			int copyOfNumber = 0;
			int tempNumber = num;
			while (tempNumber > 0) {
				copyOfNumber = (copyOfNumber * 10) + (num % 10);
				tempNumber /= 10;
			}
			if (copyOfNumber == num) {
				return true;
			} else {
				return false;
			}
		};
		return predicate;
	}

}
