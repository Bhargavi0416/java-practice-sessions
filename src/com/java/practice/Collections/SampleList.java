package com.java.practice.Collections;

import java.util.ArrayList;
//import java.util.List;

public class SampleList {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(10);
		list1.size();
	//	System.out.println("size of the list is :"+list1.size());
		
		list1.ensureCapacity(10);
		System.out.println(list1.size());
		list1.add(10);
		list1.add(15);
		list1.add(20);
		list1.add(25);
		list1.add(30);
		for(int i:list1) {
			System.out.print(i+",");
		}
		System.out.println();
		System.out.println("list the elements :"+list1);
		int size = list1.size();
		System.out.println(size);
		ArrayList<Integer> L = new ArrayList<Integer>(20);
		L.add(2);
		L.add(4);
		L.add(6);
		L.add(8);
		L.add(10);
		L.add(12);
		L.add(14);
		L.add(16);
		L.add(18);
		L.add(20);
		System.out.println("elements in the list L :"+L);
		int s = L.size();
		System.out.println("size of  the list L :"+s);
	    L.trimToSize();
	    System.out.println("after triming the size of list :"+L);
	    L.toArray();
	    System.out.println(L);
	    
		
		// TODO Auto-generated method stub

	}

}
