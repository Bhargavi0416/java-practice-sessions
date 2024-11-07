package com.java.practice.functions;

public class MinimunNumber {

	public static void main(String[] args) {
		float  f1 = 2.0f;
		float  f2 = 8.0f;
		float f = mul (f1,f2);
		System.out.println(f);
		int a = 10;
		int b = 5;
		int res = value(a,b);
		System.out.println(res);
		float f3=5.0f;
		float f4= 3.0f;
		float d = division(f3,f4);
		System.out.println(d);
	}
	public static float mul (float f1,float f2)
	{
		float m1 = f1*f2;
		return m1;
	
	}
	public static   int value (int a, int b)
	{
		int res = a-b;
		return res;
	}
	public static float division(float f3,float f4)
	{
		//float f5 = 5.0f;
		//float f6 = 3.0f;
		float d = f3/f4;
		return (d);// TODO Auto-generated method stub
	}

}
  

