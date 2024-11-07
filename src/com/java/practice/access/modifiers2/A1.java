package com.java.practice.access.modifiers2;

import com.java.practice.access.modifiers1.A;

public class A1 {

	public static void main(String[] args) {
		A obj = new A();
		//int N = obj.(2,3,4);
		obj.letter('c');
		int l = obj.letter('c');
		System.out.println(obj.letter('c'));
		System.out.println(l);
		System.out.println(obj.square(3.0f));
		// TODO Auto-generated method stub

	}

}
