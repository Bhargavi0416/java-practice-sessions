package com.java.practice.vector;

import java.util.ArrayList;
import java.util.Vector;
public class Vectorv1 {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();
		v1.add(null);
		v1.add(null);
		v1.add(null);
		v1.add(null);
		v1.add(null);
		v1.add(null);
		v1.add(null);
		v1.add(null);
		v1.add(null);v1.add(null);
		v1.add(null);
		v1.size();
		System.out.println(v1.size());
		
		System.out.println(v1.capacity());
		
		Vector<Integer> v2 = new Vector<>(v1);
		
		//v2.addAll(v2);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		
		v2.add(null);
		
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		
		// TODO Auto-generated method stub

	}

}
