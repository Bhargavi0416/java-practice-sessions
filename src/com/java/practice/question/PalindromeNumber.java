package com.java.practice.question;
import java.util.Scanner;

//palindromeNumber:A palindrome number is a number which remains same when its digits are reversed. ex;44644,12321

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value of num");
	    int num = sc.nextInt();
		//int num = 1234;
		int reverse = num;
		int rem=0;
		int rev =0;
		while(num>0) { //while loop is used when we does know the fixed iteration on a loop // if the condition is true then will executes the statement//
			rem = num%10;  //1234%10=4;123%10=3;12%10=2;1%10=1
			rev = rev*10+rem;
			num = num/10;//1234/10=123;123/10=12;12/10=1;1/10=0//
		}
	   //System.out.println("reverse is:"+reverse);
	
	if(reverse==rev) {
		System.out.println(reverse+"palindrome number");
	}
	else {
		System.out.println(reverse+"not a palindrome number");
	}
		

	}
}

	