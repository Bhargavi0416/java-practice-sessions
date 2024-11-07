package com.java.practice.functions;

public class AdditionMethod {
	public static int add(int a,int b,int c, int d)
	{
		int sum = a+b+c+d;
		return sum;
	}
public int subtraction (int x,int y)
{
	int sub = x-y;
	return sub;
}
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 7;
		int d = 8;
		int sum = add(a,b,c,d);
		System.out.println(sum);
		int x = 10;
		int y = 3;
		AdditionMethod obj = new AdditionMethod();
		int res = obj.subtraction(x, y);
		System.out.println(res);
	    
		
		// TODO Auto-generated method stub;

	}

}

