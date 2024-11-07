package com.java.practice.polymorphism;

public class Num {
	static float calc(float a, double b)
    {
        return(a+a);
    }
    static float calc(float a,int c)
    {
        return(a+c);
    }

	public static void main(String[] args) {
		 System.out.println(calc(15.0f,1));
		// TODO Auto-generated method stub

	}

}
