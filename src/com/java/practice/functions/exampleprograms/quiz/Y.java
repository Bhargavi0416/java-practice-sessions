package com.java.practice.functions.exampleprograms.quiz;

public class Y {

	public static void main(String[] args) {
		Equal obj = new Equal();
		obj.x = 5;
		obj.y = 5;
		System.out.println(obj.isequal());
		// TODO Auto-generated method stub

	}
	Box obj1 = new Box();
	Box obj2 = new Box();
	obj1.height = 1;
	obj1.length = 5;
	obj1.width = 5;
	obj1.volume(3,2,1);
//obj2 = obj1;
	obj1.volume(5);
	System.out.print(obj1.volume);

}
