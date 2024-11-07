package com.java.practice.methods;

public class MethodExample1 {
	
    // creating static method//
	
	public static int Square(int n)
	{
	 return n*n;            //return statement//
	}
	public int mul (int a, int b)//non static method//
	{
		int c = a*b ;    //method body
		return c;
	}

	public static void main(String[] args) {
		//int a = 5;
		//int b = 6;
		int result ;
	    result = Square(10);  // calling static method//
	    System.out.println("the square value 10 is :"+result); 
	    int a = 5;
	    int b =6;
	    MethodExample1 obj = new MethodExample1(); // creating obj for non static method//
	    int m1 = obj.mul(a,b); //calling the method//
	    System.out.println(m1);
		// TODO Auto-generated method stub

	}

}
