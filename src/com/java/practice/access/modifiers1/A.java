package com.java.practice.access.modifiers1;

public class A {
	int num1(int x,int y,int z)
	{
		int add = x+y+z;
		return add;
	}
	public float square(float n)
	{
		return n*n;
	}
	public char  letter (char c)
	{
		return c;
	}
	

	public static void main(String[] args) {
		//int x = 1;
		//int y = 2;
		//int z = 3;
		A obj = new A();
		int N = obj. num1(2,3,4);
		System.out.println(N);
	    float n = obj.square(2.0f);
		System.out.println(n);
;		// TODO Auto-generated method stub

	}

}
