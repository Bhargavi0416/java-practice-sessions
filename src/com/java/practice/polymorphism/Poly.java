package com.java.practice.polymorphism;

public class Poly {

	private String concatenate(String s,String s1,int c,int d)
	{
		System.out.println(c+d);
		return s+s1;
	}
	private String concatenate(String s,String str,String S,String st,String t)
	{

		System.out.println("String concatenated:"+s+str+S+st+t);
		return s+str+S+st+t;
	}
public static void main(String[] args) {
	Poly p1 = new Poly();
	String s = "Welcome" ;String s1 = "to java";
    System.out.println("String concatenated:"+s+s1);
    p1.concatenate("Welcome","tojava",5,8);
    p1.concatenate("java","is"," a","plat-form","independent");		
 

		// TODO Auto-generated method stub

	}

}
