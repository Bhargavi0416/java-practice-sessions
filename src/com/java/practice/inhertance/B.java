package com.java.practice.inhertance;

public class B extends A {
	String s;
	public B(String s,float num1,float num2) {
		super(num1,num2);
		this.s=s;
		}
	public void print() 
	{
		System.out.println("print");
		System.out.println("String s:"+s+"\n"+"float num1:"+num1+"\n"+"float num2:"+num2);
		
	}
	public static void main(String[]args) {
		B obj = new B("String",1.2f,2.2f);
		//System.out.println(s+","+num1+""+,num2);
		obj.print();
		obj.printdetalis( );
	}

}





