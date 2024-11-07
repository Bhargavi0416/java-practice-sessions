package com.java.practice.question;
import java.util.Scanner;
//factorial number is number which is multiple by every number below it 1*2*3*4 4! either it may be Ascending order or descending order.
//a number which multiple by all positive numbers in a given factorial number it is denoted by n!
//A factorial n number which is the product of all positive integers in either ascending or descending order.
public class FactorialNumber {

	
	public static void main(String[] args) {
	     Scanner  sc = new Scanner(System.in);
		 System.out.println("enter a number");
		 int x =  sc.nextInt();
		 int fact = 1;
		// for(int i = 1; i<=x; i++) {
			// fact = fact*i;
			// System.out.println("factorial number:"+fact);
		// }
		// TODO Auto-generated method stub
		 for(int i = x; i>=1; i--) {
			 fact = fact*i;
			 System.out.println("factorial number:"+fact);
			 
		 }

	}

}
