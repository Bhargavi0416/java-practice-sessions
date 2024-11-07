package com.java.practice.Abstraction.Interface;

public interface T {
 	int mul ();
   float add();
}
class Test implements T {
public  int mul () {
		System.out.println("multipication");
		return 0;
	
}
public	float add() {
		System.out.println("addition");
		return 0.0f;
	}

}
