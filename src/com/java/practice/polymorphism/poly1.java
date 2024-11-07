package com.java.practice.polymorphism;

public class poly1 extends PolymorphismExample {
	@Override
	public void details()
	{
		System.out.println("details");
	}

	public static void main(String[] args) {
		poly1 obj = new poly1();
		obj.details();
		obj.details();
		// TODO Auto-generated method stub

	}

}
