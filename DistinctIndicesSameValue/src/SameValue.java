
//This is the only class.
//It checks if from the given array there exist two distinct indices with the same value 
//and whether the absolute difference of the indices is utmost the provide key value or not. 

import java.util.Scanner;

public class SameValue {

	public static void main(String[] args) {
		//flag variable
		int counter = 0;
		
		//An array of integers.
		int[] nums = new int[] { 10, 20, 30, 40, 10, 50, 60 };
		System.out.print("Enter the key value\n");
		Scanner sc = new Scanner(System.in);
		
		//Accepting the Key value from the user
		int key = sc.nextInt();
		
		//Length calculation of the array
		int lengthOfNums = nums.length;
		
		//Loop for checking the same value at different indices and the absolute difference 
		//is utmost the key value or not.
		for (int i = 0; i < lengthOfNums; i++) {
			for (int j = i + 1; j < lengthOfNums; j++) {
				if (nums[i] == nums[j] && Math.abs(i - j) >= key) {
					counter++;
					System.out.println("\nFirst value at ->" + (i + 1) + " and Second at ->" + (j + 1));
					break;
				}
			}
		}
		
		//If flag remains unaltered then there is no such values in the array
		if (counter == 0) {
			System.out.println("No same value");
		}
	}

}
