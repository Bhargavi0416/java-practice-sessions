package com.java.practice.Collections;

import java.util.ArrayList;

public class StringListEx {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("child classes in list");
		str.add("Arraylist");
		str.add("vector");
		str.add("stack");
		str.add("Linkedlist");
		System.out.println(str);
		str.add(0,"Collection interface");
		str.add(1,"List interface");
		System.out.println(str);
		

		// TODO Auto-generated method stub

	}

}
