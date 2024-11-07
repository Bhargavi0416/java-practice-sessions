package com.java.practice.vector;

import java.util.Vector;

public class VectorClassExample {

	public static void main(String[] args) {
	Vector v1 = new Vector();
	v1.add("vector");
	v1.add("child");
	v1.add("class");
	System.out.println(v1);
		
	Vector<String> s1 = new Vector<>(5);
	s1.add("v");
	s1.add("e");
	s1.add("c");
	s1.add("t");
	s1.add("o");
	s1.add("r");
	System.out.println(s1.size());//it return the number of components in the vector 
	System.out.println(s1);
	s1.add(0,"a");
	s1.add(1,"b");//add(int index,obj e) method is used to add elements at specified  position in the vector 
	s1.add(2,"c");
	s1.add(3,"d");
	System.out.println(s1);
		
		
	//System.out.println(s1.size()); //it return the number od components in the vector 
System.out.println(s1.capacity());//capacity method Returns the current capacity of this vector.
s1.addAll(0, v1);//addAll(intindex,collection) method is used to Insert all of the eles in the specified Collection into this Vector at the specified position. 
System.out.println(s1);

      s1.addElement("xyz");
      System.out.println(s1);
      
      System.out.println(s1.firstElement());// firstElement method return the first  element from the vector
      
		
		
		// TODO Auto-generated method stub

	}

}
