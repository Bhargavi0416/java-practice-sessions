package com.java.practice.vector;

import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);
		v.add(80);
		System.out.println(v);
		
		v.addElement(90);
		System.out.println(v);
		
		System.out.println(v.firstElement()); //it retrun the first element from the vector
		
		//v.elementAt(5);
		System.out.println(v.elementAt(5)); //elementAt(index) method it returns  the specified index element from the vector
		
		System.out.println(v.elements());
		
		Vector<Integer> v1 = new Vector<>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		
		System.out.println(v.equals(v1));// it compares the element at the specified position from the vectorlist. 
		
		//v1.get(2);
		System.out.println(v1.get(1));// get(index) return the element from the specified position of the vector 
		
	    System.out.println(v1.remove(2));	//  remove(index) method removes and return the element from the vector list
	 
	    v.removeAll(v1);
	    System.out.println(v);
	    
	    v.removeElementAt(0); //removeElementAt(index) it will removes the specific index element from the vector list.
	    System.out.println(v);
		
		v.setElementAt(100, 4);//SetElementAt(obj e,index) method sets the element at the specified position in the vector.
		System.out.println(v);
		
		v.set(1, 200);//method replace the element at the specified position with the specified element in the vector.
		System.out.println(v);
		
		v.setSize(10);
		System.out.println(v.size());
		System.out.println(v);
		
		//v.capacity();
		System.out.println(v.capacity());
	
		
		// TODO Auto-generated method stub

	}

}
