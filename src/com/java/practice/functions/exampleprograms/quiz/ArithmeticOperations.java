package com.java.practice.functions.exampleprograms.quiz;

import java.util.Scanner;
public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Arithmetic opearations");
		int x = sc.nextInt();
		System.out.println("enter first number :"+x);
		int y = sc.nextInt();
		System.out.println("enter second number :"+y);
		int add = x+y;
		int sub = x-y;
		int mul = x*y;
		int div = x/y;
		int mod = x%y;
		System.out.println("Addition of two number : " +add+ "\n" +"Subtraction of two numbers : " +sub+ "\n"
				      +"Product of two numbers : " +mul+ "\n" +"Division of two numbers : " +div+ "\n" +"Modul of two numbers : " +mod);
		System.out.println(x + "+" + y + "=" + (x+y));
		// TODO Auto-generated method stub

	}

}
// System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ", sum, minus, multiply, subtract, divide, rnums);