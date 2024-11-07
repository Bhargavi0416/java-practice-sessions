package com.java.practice.Collections;

import java.util.ArrayList;

public class FloatArrayList {

	public static void main(String[] args) {
	    
	    ArrayList<Float> f = new ArrayList<Float>();
	    f.add(0.5f);
		f.add(1.5f);
		f.add(2.0f); //boolean add methed is used to append(add) the specific element at the end of the list//
		f.add(3.5f);
		System.out.println("float elements of the list is :"+f); //[0.5, 1.5, 2.0, 3.5]
		f.add(0,2.5f); // void add method is used to insert specific element at the specific position of index in the list//
		f.add(3,5.0f);
		System.out.println("float elements of the list after modified method void add is :"+f);//[2.5, 0.5, 1.5, 5.0, 2.0, 3.5]
		
		boolean b = (f.contains(6.5f)); // it return the boolean value if the list contains the specified element//
		System.out.println("contains method  value of the list :"+b);//false
		
		float f1 = f.get(4); //it return the specific element from the list //
		System.out.println(" gets method prints  the specific position of elements from the list :"+f1);//2.0
	
		int firstindex = f.indexOf(2.5f); // it return the index of first occurance of  specified element from the list //or -1 if no ele in list
		int lastindex = f.lastIndexOf(6.5f);//it return the index of last occurance of specified element from the list either it return -1//
		                                             // in case there is no element in the list//
		System.out.println("the element 2.0f is at index   :"+firstindex+ "\n" +"the element of 3.5f is at lastIndexOf :"+lastindex);//0 -1
		
		int size = f.size(); // size method return the size of list //
	    System.out.println("list of size is :"+size);//6
	    
	    f.clear(); //clear method will clear all elements from the list//
		System.out.println("clear elements :"+f);//[]
		
		boolean b1 = f.isEmpty(); // isEmpty method will return boolean value if the list does not contain any elements//
		System.out.println("the list is empty :"+b1);//true
		
		// TODO Auto-generated method stub

	}

}
