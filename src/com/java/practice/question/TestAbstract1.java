package com.java.practice.question;

public class TestAbstract1 extends TestAbstract {
	void display() {
		String s = myname();
		System.out.println("my name is "+s);
	}
	public static void main(String args[]) {
		TestAbstract1 a = new TestAbstract1();
		a.display();
				
}
}