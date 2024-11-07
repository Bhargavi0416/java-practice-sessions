package com.java.practice.functions;

public class StaticExample {
	
	 static int x = 4;
	 public void s1Example() {
		 x = 3;
		 System.out.println(x);
	 }
	 public void s2Example() {
		System.out.println(x); 
	 }
	   
public static void main (String[]args) {
	StaticExample S = new StaticExample();
	System.out.println(x);
	S.s1Example();
	S.s2Example();
	
}
	}


