package com.java.practice.Abstraction;

public class Rectangle extends Circle{
    
	void rectangle()
	{
		System.out.println("draw a rectangle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class MainM1 {
	public static void main(String args[]) {
	  Shapes s = new Circle(); 
	  Shapes s1 = new Rectangle();
	  Rectangle r = new Rectangle();
	 // Circle c = new Circle();
	  s.area(); 
	  s.print();
	  r.rectangle();     //Circle c = new Circle///Rectangle r = new Rectangle();
	}
	
}
