package com.java.practice.Abstraction.Interface;

import com.java.practice.Abstraction.Interface.InterfaceMethod.M1;

public class M2 {

	public static void main(String[] args) {
		M1 obj = new M1();
		M3 ref = new M3();
		ref.show();
		ref.display();
		M4 m = new M4();
		m.name();
		m.sum();
		// TODO Auto-generated method stub

	}

}
