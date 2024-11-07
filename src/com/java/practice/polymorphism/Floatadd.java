package com.java.practice.polymorphism;

public class Floatadd {
	 static void print(float a, double b)
	    {
	        System.out.println(a+a);
	    }
	    static void print(float a, float c)
	    {
	        System.out.println(a+c);
	        
	    }

	public static void main(String[] args) {
		print(15.0f,5.0); //(15.0,5.0)//compilation error
		print(5.0f,3.0f);                                //The method print(float, double) in the type Floatadd is not applicable for the arguments (double, double)
		// TODO Auto-generated method stub
		

	}

}
