package com.java.practice.functions.innerClassess;

public class Inner {

	public static void main(String[] args) {
		
		String name = "Student";
		float f = 5.5f;
		boolean b = true;
		System.out.println(name+""+f+""+b);
		Nested n = new Inner().new Nested();
		n.nest();	
		n.type();
		// TODO Auto-generated method stub

	}
	class Nested extends Inner{
		String s = "person";
		public void type()
		{
			System.out.println("nested class will support to extend superclass");
		}
	{
		//super(String name,float f,boolean b);
	}
		void nest() {
			System.out.println("non-static nested class");
		}
	}class c1 {
		Nested n1 = new Nested();
		
		
		
	}

}
