package com.java.practice.functions;

public class SumofDigits {

	public static void main(String[] args) {
		int n = 1234;
		int s = digit(n);
		System.out.println(s);
		
	}
	
	public static int digit(int n) {
        int sum = 0;
		int rem = 0;
		while(n>0)
		{
			rem = n%10;
			sum = sum+rem;
			n=n/10;
		}
		return sum;
		// TODO Auto-generated method stub

	}

}
