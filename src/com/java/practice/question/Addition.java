package com.java.practice.question;
import java.util.Scanner;

public class Addition {
	public static int add(int a,int b) {
		int c = a+b;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to values of x and y");
		int x = sc.nextInt();
		int Y = sc.nextInt();
		int Z = x+Y;
		System.out.println(Z);
		int i = add(3,2);
		System.out.println(i);
		/*int a =3; 
		int b =2;
		int c = a+b;
		//System.out.println(c);
		// TODO Auto-generated method stub*/

	}

}
