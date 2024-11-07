package com.java.practice.polymorphism;

public class MethodOverloading {
	public  double add(double a,int b, float x,float y,float z)
	{
		System.out.println(x*y*z);
		return a+b;
	
	}
	private double add(int a,double b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		MethodOverloading m1 = new  MethodOverloading();
		//m1.add(12345.123,23);
		//System.out.println(m1.add(12345.123,23));
		m1.add(56,345.678);
		System.out.println(m1.add(56,345.678));
		m1.add(12345.123,23 ,3.0f,4.0f,5.0f);
		
		// TODO Auto-generated method stub

	}

}
