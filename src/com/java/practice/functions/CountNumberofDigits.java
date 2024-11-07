package com.java.practice.functions;

public class CountNumberofDigits {

	public static void main(String[] args) {
		int i = 123456789;
		int count = 0;
		while(i>0) {
			i = i/10;
			count++;
		}
			System.out.println("number of digits:"+count);
			
		
		// TODO Auto-generated method stub

	}

}
