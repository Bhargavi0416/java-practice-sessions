package com.java.practice.functions;

public class RevNumber{

	public static void main(String[] args) {
		int n = 1234 ;
		int remainder = 0;
		int res = 0;
		while(n >0) {
			remainder = n%10;
			res = res*10 + remainder;
			n=n/10;
		}
		
		System.out.println("Reverse Number is:"+res);		
		// TODO Auto-generated method stub

	}

}
