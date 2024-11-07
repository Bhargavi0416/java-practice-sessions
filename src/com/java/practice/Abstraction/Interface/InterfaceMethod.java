package com.java.practice.Abstraction.Interface;

public interface  InterfaceMethod {
	void show();
	void display();

public interface MethodImpl extends InterfaceMethod {
	String name();
	float sum();
}

public class M1 implements MethodImpl {
public 	void show() {}
public	void display() {}
public String name() {
	System.out.println("hello");
	return null;

}
public float sum() {
	System.out.println("float number");
	return 0.0f;
	
}
public static void main(String[] args) {
	M1 obj = new M1();
}
}
}
//class M {
//	public static void main (String args[]) {
//		M1 obj = new M1();
//		
//	}
//}