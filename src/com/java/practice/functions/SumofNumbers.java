package com.java.practice.functions;

public class SumofNumbers {

	
	public static void main(String[] args) {
		int n = 345;
		int remainder = 0;
		int sum = 0;
		while(n>0)
		{
			 remainder = n%10;
			 sum = sum+remainder;
			 n = n/10;
			
		}
		System.out.println("the sum of the number is:"+sum);
		// TODO Auto-generated method stub

	}
	//public static void add();
	//return a+b;

}
