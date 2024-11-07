package com.java.practice.polymorphism;

public class Test {
	public int add(int a,int b,String s)
	{
	
		System.out.println(s);
		return a+b;
	}
public int add(int a,int b,int c)
{
	return a+b+c;
}
private int add(int x,int y)
{
	System.out.println(x+""+y); //x=2,y=3
	return 0;

private int add(int y,int x)
{
	System.out.println(y+""+x);
	return 0;
}

	public static void main(String[] args) {
		//int a = 3; int b = 4;int c = 5;
		Test obj = new Test();
		//obj.add(3,4,"Method overloading");
		obj.add(3,4,5);
		int n = obj.add(3,4,"Method overloading");
		System.out.println("sum of two numbers  is:"+n);
		System.out.println(obj.add(3,4,5));
		//System.out.println(s);
		//int N = obj.add(2,3);
		float s = obj.add(3.0f,2.0f);
		// TODO Auto-generated method stub

	}

}
