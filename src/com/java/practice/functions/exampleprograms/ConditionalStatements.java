package com.java.practice.functions.exampleprograms;
//write a program to find largest number
public class ConditionalStatements {   //conditional statements check whether the given  condition is true or false//

	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		int c = -10;
		int d = 20;
		if(a<b && a<c && a<d) {
		//if (a>b && a>c && a>d) {
			System.out.println(a);
		}
		
		else if( b<a && b<c && b<d) {
		//else if (b>a && b>c && b>d) {
			System.out.println(b);
		}else if(c<a && c<b && c<d) {
		//else if (c>a && c>b && c>d) {
			System.out.println(c);
		}
		else {
			System.out.println(d);
		}
		// TODO Auto-generated method stub

	}

}
