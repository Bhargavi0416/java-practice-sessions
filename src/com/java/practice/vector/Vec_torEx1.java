package com.java.practice.vector;

import java.util.Vector;

public class Vec_torEx1 {

	public static void main(String[] args) {
		Vector<Character> c1 = new Vector<>();
		c1.add('a');
		c1.add('b');
		c1.add('c');
		c1.add('d');
		c1.add('e');
		System.out.println(c1);
		
		//c1.remove(c1);
		//System.out.println(c1.remove());
		System.out.println(c1.lastElement());
		
		c1.insertElementAt('f', 5);
		System.out.println(c1);
		
		//c1.removeElement(c1);
		System.out.println(c1.removeElement('e'));
		System.out.println(c1);
		
		
		
		c1.removeAllElements();
		System.out.println(c1);
		
		System.out.println(c1.size());
		
		
		System.out.println(c1.isEmpty());
		// TODO Auto-generated method stub

	}

}
