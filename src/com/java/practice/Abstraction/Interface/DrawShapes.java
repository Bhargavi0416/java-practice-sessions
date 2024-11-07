package com.java.practice.Abstraction.Interface;

public interface DrawShapes {
	void print();
	void show();
	void display();
	default void msg() {System.out.println("Default method");}

}
/*class Triangle implements DrawShapes {
	
public static void main(String[]args) {
	Triangle t = new Triangle();
	t.print();
	t.show();
	t.display();
	t.msg();
	
}
}*/