package com.java.practice.Collections;

import java.util.ArrayList;

public class CharacterList {

	public static void main(String[] args) {
		
		ArrayList<Character> ch = new ArrayList<Character>();
		ch.add('a');
		ch.add('b');
		ch.add('c');
		ch.add('d');
		ch.add('e');
		System.out.println(ch);
		ch.add(1, '5');
		System.out.println(ch);
		
		char i = ch.set(2,'a'); // set method it replace the element from the specified position in the list with specified element
		
		System.out.println("after set method :"+ch);
		System.out.println("replaced 2nd index element from the list :"+i);
		
		char c = ch.set(1, 'b');
		System.out.println("after set operation :"+ch);
		System.out.println("replaced 1st index element from the list :"+c);
		ch.toArray();
		System.out.println(ch);
		// TODO Auto-genrated method stu
	}

}
