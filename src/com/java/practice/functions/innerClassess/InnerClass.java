package com.java.practice.functions.innerClassess;

import com.java.practice.functions.innerClassess.Test1.Test2;

public class InnerClass {

	public static void main(String[] args) {
		int num = 100;
		System.out.println(num);
		InnerClass1 obj = new InnerClass.InnerClass1();
		obj.show();
		Test2 t2 = new Test1.Test2();
		t2.show();
	InnerClass.InnerClass1.Test1 t1 = new InnerClass1.Test1();
		t1.print();
		Test1.Test2.C1 c = new Test1.Test2.C1();
		c.display();
		

		// TODO Auto-generated method stu
	}
	
	
	public static class InnerClass1 {
		public static  void show() {
			System.out.println("show");
		}
		
		 public static class Test1 {
			public static  void print() {
				System.out.println("print");
			}
		}
		
	}
}

