package com.java.practice.inhertance;

public class Child extends Parent{
	public void Print() {
	    super.Print();  
        System.out.println("Child\'s Print()");
        super.Print(); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class C {
    public static void main(String[] args) {
        Child c = new Child();
        c.Print();
    }
}