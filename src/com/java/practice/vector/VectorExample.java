package com.java.practice.vector;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> str = new Vector<>(20);
		str.add("100");
		str.add("200");
		str.add("300");
		str.add("400");
		str.add("500");
		System.out.println("vector elements :"+str);
		
		System.out.println("vector elements size is:"+str.size());
		
		System.out.println("vector elements capacity is:"+str.capacity());
		
		str.trimToSize();
		System.out.println("vector elements size by triming method is:"+str.size());
		
		System.out.println("vector elements capacity after trimimg the size :"+str.capacity());
		
		Vector<Integer> vect = new Vector<>();
		vect.add(0,100);
		vect.add(1,500);
		vect.add(2,300);
		vect.add(3,1000);
		System.out.println(vect);
		
		str.retainAll(vect);
		System.out.println(str);
		
		System.out.println(str.retainAll(vect));
		
		System.out.println(vect.retainAll(str));
		
		vect.retainAll(str);
		System.out.println(vect);
		
		//vect.contains(str);
		//System.out.println(str);
		
		
		
		// TODO Auto-generated method stub

	}

}
