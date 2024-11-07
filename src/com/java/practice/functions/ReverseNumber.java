package com.java.practice.functions;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		
		//int n= 0;
		int rev = 0;
		while(num != 0) 
	{   
			//int rem = num%10;                 //  1234 != 0 condition is true//
			rev = rev*10 + num%10;  // 0*10 +1234%10=  4,4*10=40+123=40+3=43,43*10=430+2=432.432*10=4320+1=4321//
		    num = num/10; //1234/10 it will eliminate the last digit 4 and the number is 123, 123/10=12, 12/10=1,1/10=0//
		}
		// TODO Auto-generated method stub
	  System.out.println("Reverse Number:"+rev);

	}
}


