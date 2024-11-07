package com.java.practice.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
//		int n = 5;
//		ArrayList<Integer> list1 = new ArrayList<Integer>(n);
//		for(int i = 0; i<n;i++) 
//		{
//			list1.add(i);
//			//System.out.println("List1 Numbers :"+list1);
//			
//		}
//		System.out.println("List1 elements :"+list1);
//		int num = 10;
//		ArrayList<Integer> list2 = new ArrayList<Integer>(num);
//		for(int j = 5; j<num;j++)
//		{
//			list2.add(j);
//		}
//		System.out.println("List2 elements :"+list2);
//		
//	    list1.addAll(list2);
//		System.out.println("printing the list1 and list2 together :"+list1);
//		
//		list1.addAll(3,list2);
//		System.out.println("modifing the list1 and list2 together :"+list1);
//		
//		list1.removeAll(list1);
//		System.out.println("removed the elements from the list :"+list1);
//		
//		list1.add(1);list1.add(3);list1.add(5);list1.add(7);list1.add(9);list1.add(11);list1.add(13);
//		System.out.println("add the list1 elements :"+list1);
//		
//		list2.add(3);list2.add(5);
//		System.out.println("list2 elements :"+list2);
//		
//		list1.retainAll(list2);
//		System.out.println("retain list :"+list1);
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		List<Integer> l2 = new ArrayList<Integer>();
//		l2.add(3);
//		l2.add(4);
//		l2.add(5);
		l2.add(6);
		l2.add(7);
		l2.add(8);
		
		System.out.println(l1);
		System.out.println(l2);
		
		l1.retainAll(l2);
		System.out.println(l1);
//		
//		l2.retainAll(l1);
//		System.out.println(l1);
//		
		System.out.println(l1.removeAll(l2)); 
		System.out.println(l1);
		System.out.println(l2);
		
		// TODO Auto-generated method stub

	}

}
