package com.java.practice.ExceptionHandling;

import java.rmi.AccessException;

public class ExceptionHandlingEx {

	public static void main(String[] args) throws Exception {
		try {
		  Exp();
		}catch(Exception e ) {
			System.out.println("catch block");
			//	e.printStackTrace();
		}
		try {
			exphandling();
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("access Exception");
			e.printStackTrace();
		}
		
	}
	public static void Exp() {
		
		System.out.println("Exception handling");
		int x = 1/0;
		System.out.println("progrma completed");
		
	}
	public static void exphandling() throws Exception{
		  System.out.println("Throws exception");
		  int Arr[] = new int[5];
		  for(int i =0;i<Arr.length;i--) {
			  System.out.println(Arr[i]);
		  }
	}

}
