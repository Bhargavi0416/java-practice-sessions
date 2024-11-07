package com.java.practice.functions.exampleprograms.quiz;
//write a java program to print hello and hello world of the different lines
//write a java program to print name by using scanner class

import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		System.out.println( "   hello \n hello world ");
		
		Scanner sc = new Scanner(System.in);
		String fname = sc.next();
		System.out.println("first name :"+fname);
		String lname = sc.next();
		System.out.println("Last name :"+lname);
		System.out.println(fname +"."+ lname);
		String Dob = sc.next();
		System.out.println("Dob : " +""+ Dob);
		
		// TODO Auto-generated method stub

	}

}
