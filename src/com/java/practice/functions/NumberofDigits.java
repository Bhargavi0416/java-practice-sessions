package com.java.practice.functions;

public class NumberofDigits {

	public static void main(String[] args) {
		int n = 12345;
		int c = digits(n);
		System.out.println(c);
	}
		public static int digits(int n)
			{
			  int count = 0;
			  while(n>0)
			{
				n = n/10;
				count++;
			}
			  return count;
		
		// TODO Auto-generated method stub

	}

}
