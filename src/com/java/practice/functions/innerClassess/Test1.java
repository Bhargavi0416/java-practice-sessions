package com.java.practice.functions.innerClassess;

import com.java.practice.functions.innerClassess.Inner.Nested;
import com.java.practice.functions.innerClassess.InnerClass.InnerClass1;

public class Test1 {

	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);
		Test2 t2 = new Test1.Test2();
		t2.show();
		InnerClass.InnerClass1.Test1 t1 = new InnerClass1.Test1();
		t1.print();
		Test1.Test2.C1 c = new Test1.Test2.C1();
		c.display();
		Nested n = new Inner().new Nested();
		n.nest();		
		
		
		// TODO Auto-generated method stub

	}
	
	public static class Test2 {
		public void show() {
			System.out.println("Show");
		}
		protected static class C1 {
			void display() {
				System.out.println("display");
			}
		}
	}

}
