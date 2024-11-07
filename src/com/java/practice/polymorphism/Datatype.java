package com.java.practice.polymorphism;

public class Datatype {
	
	static void print(int a)
    {
        System.out.println("string");
    }
    static void print(String a, int c)
    {
        System.out.println("int");
        System.out.println(c);
    }

	public static void main(String[] args) {
		print("hello",6);
		print(2);
		//print(0,"hi");//compilation error//the method print(String, int) in the type Datatype is not applicable for the arguments (int, String)
		// TODO Auto-generated method stub

	}

}
