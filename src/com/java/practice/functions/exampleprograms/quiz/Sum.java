package com.java.practice.functions.exampleprograms.quiz;
//write a java program to print sum of two numbers
import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =  sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("sum : "+c);
		int d = a/b;
		System.out.println("remainder : "+d);
		
		int result = 10/3;
		System.out.println(result);
		
		
		float m1 = sc.nextFloat();
		float m2 = sc.nextFloat();
		System.out.println("product of m1 and m2 : "+m1*m2);
		// TODO Auto-generated method stub

	}

}
