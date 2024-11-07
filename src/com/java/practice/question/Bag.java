package com.java.practice.question;

public class Bag {
	String colour;
	String Size;
	public Bag ( String colour,String size)
		{
		this.colour = colour;
		this.Size = size;
		}
	public static void main(String args[]) {
		Bag b = new Bag("black","small");
		
		System.out.println(b.colour);
		System.out.println(b.Size);
	}
		
	}


