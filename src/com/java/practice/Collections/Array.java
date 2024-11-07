package com.java.practice.Collections;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		
		// Declaring the arraylist without size //
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(0,1);
		a1.add(1,2);  // these is add method which insert object elements add(int index,obj element)
		a1.add(2,3);  // 
		a1.add(3,4);
		a1.add(4,5);
		System.out.println("print arraylist1 :"+a1); 
		
		boolean b1 = a1.contains(10);
		boolean b2 = a1.contains(5);
		System.out.println("the value of b1 :"+b1+ "\n" + "the value of b2 :" +b2);
		
		
		
		//declaring the arraylist with size//
		int n = 10;
		ArrayList<Integer> a2 = new ArrayList<Integer>(n);
		for(int i =0; i<n;i++)
		{
			//a2.add(i);
			//System.out.println("print arraylist2 :"+a2);
			//System.out.println("print arraylist2 :"+a2.add(i));
		}
		System.out.println("print arraylist2 :"+a2);
		
		ArrayList<Float> f1 = new ArrayList<Float>();
		for(float j =0;j<n;j++)
		{
			f1.add(j);
		}
		System.out.println("print arraylist3 :"+f1);
		
    	ArrayList<Float> f = new ArrayList<Float>();
    	f.add(10.0f);
    	f.add(20.0f);
    	f.add(30.0f);               //add(obj ele) will only insert the elements into an array//
    	f.add(2,5.0f);              //adding the position and element in the list//
		System.out.println("float arraylist :"+f);
		
		ArrayList<Integer> arr = new ArrayList<Integer>(4);
		arr.add(0, 2);
		arr.add(1, 4);
		arr.add(2, 6);
		arr.add(3, 8);
		System.out.println("print list :"+arr);
	    arr.clear();    // clear method will remove the all object element from the list//
	    System.out.println("clear the elements for the list"+arr);
	   // boolean b = arr.contains(f);
	  //  arr.contains(a1);
	    ArrayList<String> str = new ArrayList<String>();
	    str.add(0,"apple");
	    str.add(1,"banana");
	    str.add(2,"orange");
	    str.add(3,"grapes");
	    str.add(4,"watermelon");
	    str.add(5,"blackberry");
	    System.out.println("print the String list :"+str);
	    
	   // str.clear();
	   // System.out.println("clear elements :"+str);
	    String s = str.get(3);  // get method is gets the specific element from the list //
	    System.out.println("the element of index  3 :"+s);
	    
        int s1 =  str.indexOf("grapes");
        int s2 =str.lastIndexOf("blackberry");
        
	    System.out.println("the element grapes is at index   :"+s1+ "\n" +"the element of blackberry is at lastIndexOf :"+s2);
	    
	    str.remove(s2); //remove(object ele ) it will remove the  specific index element from the the list//
	    System.out.println("the  object  of s2 in the list :"+str);
	    
	    str.remove(s);   //remove(int index)
	    System.out.println("remove the s element : "+str);
	    
	    int size = str.size(); // size method return the size of list //
	    System.out.println("list of size is :"+size);
	    
	    str.clear(); //clear method will clear all elements from the list//
		System.out.println("clear elements :"+str);
		
		boolean b = str.isEmpty(); // isEmpty method will return boolean value if the list does not contain any elements//
		System.out.println("the list is empty :"+b);
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
