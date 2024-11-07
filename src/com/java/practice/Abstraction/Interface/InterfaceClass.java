package com.java.practice.Abstraction.Interface;

public interface InterfaceClass {
	static int pincode = 503225;
	 float display();
}
class Class implements InterfaceClass {
	public  float display() {
		return 0.0f;
	}
	//overloading
	public float display(float a,float b)
	{
		System.out.println(a+""+b);
		return 0.0f;
	}
	public float display(int x,int y)
	{
		return x+y;
	}
}
