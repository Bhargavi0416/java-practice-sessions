package com.java.practice.Abstraction.Interface;

public interface A {
	void add();
	void mul();

}
class B implements A {
	public void add() {System.out.println("addition method");}
    public void mul() {System.out.println("Multiplication");}
	

public static void main(String args[]) {
	B b = new B();
	b.add();
	b.mul();
	
}
}
	
