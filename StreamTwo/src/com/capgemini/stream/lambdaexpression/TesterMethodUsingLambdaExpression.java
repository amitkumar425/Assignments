//This is the implementation class for MethodsUsingLambdaExpression.java .
//From the given List of numbers from 1 to 50, it prints the odd, prime and pallindrome from it.
//It uses lambda expression to do so.
package com.capgemini.stream.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class TesterMethodUsingLambdaExpression {

	public static void main(String[] args) {
		
		//taking a list with numbers from 1 to 50 in it.
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			list.add(i);
		}

		//Printing the odd numbers from the list.
		System.out.println("Odds from 0 to 50 --- ");
		list.stream().filter(MethodsUsingLambdaExpression.isOdd()).forEach(n -> System.out.print(n + " "));

		//Printing the prime numbers from the list.
		System.out.println("\nPrime from 0 to 50 --- ");
		list.stream().filter(MethodsUsingLambdaExpression.isPrime()).forEach(n -> System.out.print(n + " "));

		//Printing the odd palindrome from the list.
		System.out.println("\npalindrome from 0 to 50 --- ");
		list.stream().filter(MethodsUsingLambdaExpression.isPalindrome()).forEach(n -> System.out.print(n + " "));
	}

}
