package com.java.practice.functions.exampleprograms.quiz;

public class B1 {
	public static void main(String[] args) {
		Box obj1 = new Box();
		Box obj2 = new Box();
		obj1.height = 1;
		obj1.length = 5;
		obj1.width = 5;
		obj1.volume(3,2,1);
	
		//obj1.volume(5);
		System.out.print(obj1.volume);
		
		}

}
