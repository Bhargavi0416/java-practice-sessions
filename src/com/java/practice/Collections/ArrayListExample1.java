package com.java.practice.Collections;

import java.util.ArrayList;


public class ArrayListExample1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		System.out.println("the list of boolean add method  of a1 is :"+a1 ); //the list of boolean add method  of a1 is :[1, 2, 3]
        a1.add(2,5);
        a1.add(4,8);
        System.out.println(" the list  void add method  of a1 is :"+a1); //the list  void add method  of a1 is :[1, 2, 5, 3, 8]
        
        boolean b = a1.contains(8);
        System.out.println(" contains method value  in the list  :"+b);//true
        
        int i = a1.get(4);
        System.out.println("print the specific  position of element from the list :"+i);//8
        
        int firstindex = a1.indexOf(3);
        int lastindex = a1.lastIndexOf(8);
        System.out.println("the element 3 is at index   :"+firstindex+ "\n" +"the element of 8 is at lastIndexOf :"+lastindex);// 3, 4
        
        a1.remove(1);   //remove(index ) it will remove the  specific index element from the the list//
	    System.out.println("removed 5 element from the list :"+a1); //[1,5,3,8]
	    
	    a1.remove(3); //remove(object ele ) it will remove the  specific  element from the the list//
	    System.out.println("removed 8 element from the list :"+a1);// [1,5,3]
	    
	    int size = a1.size(); // size method return the size of list //
	    System.out.println("list of size is :"+size);//3
	    
	    a1.clear(); //clear method will clear all elements from the list//
		System.out.println("clear elements :"+a1);//[]
		
		boolean value = a1.isEmpty(); // isEmpty method will return boolean value if the list does not contain any elements//
		System.out.println("the list is empty :"+value); //true
		
	}

}
