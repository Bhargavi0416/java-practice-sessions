package com.java.practice.polymorphism;

public class PrintValue {
	private static void display(int a)
    {
        System.out.println("string");
    }
    private static void display(String a)
    {
        System.out.println("int");
    }

	public static void main(String[] args) {
		display("hello");
		display(5);
		// TODO Auto-generated method stub

	}

}
