package com.java.practice.vector;

import java.util.Vector;

public class VectorStr {

	public static void main(String[] args) {
	Vector<String> st = new Vector<>();
	st.insertElementAt("list interface",0);
	st.insertElementAt("implements",1);
	st.insertElementAt("vector",2);
	st.insertElementAt("child",3);
	st.insertElementAt("class",4);
	st.insertElementAt("collection",5);
	System.out.println(st.toString());
		
    //System.out.println(st.elements());
		
	System.out.println(st.size());
		
	System.out.println(st.capacity());//The method returns the capacity or the internal data array’s length present in the Vector, which is an integer value.
		
	st.trimToSize();
	System.out.println(st.size());
	System.out.println(st.capacity());
		
	 st.setSize(8);
	 System.out.println(st.size());
	 
	System.out.println(st.capacity());

//		
		
		
	
		
		// TODO Auto-generated method stub

	}

}
