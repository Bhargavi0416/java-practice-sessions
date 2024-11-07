package com.java.practice.hybridInheritance;

public class MethodOverloading {
	public static String printString(String s1,String s2,boolean b)
	{
		return s1+s2+b;
		
	}
	public static String printString(Short s,Double d,char c,String s3)
	{
		return s3 +d +s +c;
	}

	public static void main(String[] args) {
		Short S = -12345;
		System.out.println(printString("hello",","+"java"+",",true));
		System.out.println(printString(S,   123456.9870,  'A',   "welcome"));
		// TODO Auto-generated method stub

	}

}
