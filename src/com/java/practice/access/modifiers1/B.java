package com.java.practice.access.modifiers1;

public class B {

	public static void main(String[] args) {
		//int x = 5;
		//int y = 6;
		//int z = 7;
		A obj= new A();
		//int N = A.num1(x,y,z);
		obj.num1(5, 6, 7);
		System.out.println(obj.num1(5, 6, 7));
		//char ch = 's';
	//	A obj1 = new A();
		obj.letter('s');
		int L = obj.letter('s');
		System.out.println(L);
		//A obj2 = new A();
		obj.square(5);// TODO Auto-generated method stub
        float f = obj.square(5);
        System.out.println(f);
	}

}
