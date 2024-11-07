package com.java.practice.Abstraction.Interface;

public interface Xyz {
	//final variable 
	final int LandNumber = 288248;
	// abstract methods
	int add( int a,int b);
	float printnumber(float b,float a);
	String name(String s1,String s2);

}
//implementing the interface class
class Abc implements Xyz {
	//overriding abstract method form interface class
public 	int add(int a,int b) {
		return a+b;
	}
//overriding
public float printnumber(float b,float a) {
	System.out.println("print float numbers and b:"+a+""+b);
	return 0.0f;
}
//overriding
public String name(String s1,String s2) {
	System.out.println(s1+""+s2);
	return null;
}
}