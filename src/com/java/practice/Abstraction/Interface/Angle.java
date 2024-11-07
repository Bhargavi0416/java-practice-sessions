package com.java.practice.Abstraction.Interface;
//import com.java.practice.Abstraction.Interface;


public class Angle implements Shapes {
	public float output(float a,float b,int x,int y) {
		System.out.println("print the sum of a and b:"+a+b);
             return x*y;
	}
	public float persentage(float f1,float f2) {
		return f1+f2;
		// TODO Auto-generated method stub

	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
