package com.java.practice.Collections;

import java.util.ArrayList;

public class Array1 {

	public static void main(String[] args) {
		
		ArrayList<Character> list =new ArrayList<Character>(7);
		list.add(0,'r');
		list.add(1,'a');
		list.add(2,'c');
		list.add(3,'e');
		list.add(4,'c');
		list.add(5,'a');
		list.add(6,'r');
		list.add(7,'r');
		list.add(8,'a');
		list.add(9,'d');
		list.add(10,'a');
		list.add(11,'r');
		System.out.println("print the list"+list);
		
		boolean b = list.contains(5);
		boolean b1 = list.contains('r');
		System.out.println(b +" "+ b1);
		
		Character c = list.get(6);
		System.out.println("get the index elemnent 6 :"+c);
		
		int i = list.indexOf('c');
		System.out.println("print the  indexOf list c :"+i);
		
		int j = list.lastIndexOf(c);
		System.out.println("print the  lastIndexOf c :"+j);
		
		list.remove(0);
		System.out.println("print the list"+list);
		
		int size = list.size();
		System.out.println("print the list of size :"+size);
		
		list.clear();
		System.out.println("claer the list"+list);
		
		boolean val = list.isEmpty();
		System.out.println("the list is empty :"+val);
		
		
		// TODO Auto-generated method stub

	}

}
