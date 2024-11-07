package com.java.practice.functions.exampleprograms;

import java.util.Scanner;
//Write a program to print subtraction of two number 
public class Subtraction {
	

	public static void main(String[] args) {
		int x = 7;
		int y = 8;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter input: ");
		int a = sc.nextInt();
		float b = sc.nextFloat();
	    System.out.println(a + " "+ b);
		
		//int z = subtract(x,y);
		//System.out.println(z);
		// TODO Auto-generated method stu
	}
	 public static int subtract(int x,int y) {
		int z = x-y;
		return(z);
	}

}
