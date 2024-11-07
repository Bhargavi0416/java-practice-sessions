package com.java.practice.vector;

import java.util.Vector;

public class VectorEx2 {
	
	public static void main(String[] args) {
		Vector<String>  v1 = new Vector();
		v1.addElement("a");
		v1.addElement("b");
		v1.addElement("c");
		v1.addElement("d");
		v1.addElement("e");
		v1.addElement("obj");
		System.out.println(v1);
		
		Vector<String> v2 = new Vector();
		v2.addElement("a");
		v2.addElement("b");
		v2.addElement("c");
		v2.addElement("d");
		v2.addElement("e");
		v2.addElement(null);
		System.out.println(v1.equals(v2));
		
		System.out.println(v1.containsAll(v2));
		
		System.out.println(v1.contains("x"));
		
		v1.retainAll(v2);
		System.out.println(v1);
		
		System.out.println(v2.retainAll(v1));
		
		v2.removeAll(v1);
		System.out.println(v2.removeAll(v1));
		
		//System.out.println(v2);
		// TODO Auto-generated method stub

	}

}
