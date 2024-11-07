package com.java.practice.functions.exampleprograms;
import java.util.Scanner;
//write a program to print Product of two numbers
public class ProductofTwoNumbers {

	
	public static void main(String[] args) {
		Scanner Sc = new Scanner (System.in);
		System.out.println("enter value of var1 and var2");
		//int var1 = 19;
		//int var2 = 5;
		int var1 = Sc.nextInt();
		int var2 = Sc.nextInt();
		int product = var1*var2;
		int  sum = mul(var1,var2);
		System.out.println(var1+""+var2);
		// TODO Auto-generated method stub

	}public static int mul(int var1,int var2) {
		int product = var1*var2;
		return(product);
	}

}
