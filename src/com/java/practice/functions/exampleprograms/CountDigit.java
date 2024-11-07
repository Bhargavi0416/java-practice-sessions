package com.java.practice.functions.exampleprograms;//java program on count the digits in the given number//

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// Create a Scanner object to read input from the use
		int n = 12345; //sc.nextInt();//Read an integer input from the user
		int numofdigits = 0;//Initialize a variable to keep count of the number of digits
		//int original_n = n;// Store the original value of n for later use
		//Loop until the number n becomes 0

		while(n>0) {
			n = n/10;// Divide the number by 10 to remove the last digit
			numofdigits++;/// Increment the digit count by 1
		}
		System.out.println("number of digits in"  +numofdigits);
	
		// TODO Auto-generated method stub

	}

}
