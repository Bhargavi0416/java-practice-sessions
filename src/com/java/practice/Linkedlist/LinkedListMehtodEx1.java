package com.java.practice.Linkedlist;

import java.util.LinkedList;

public class LinkedListMehtodEx1 {
	public static void main(String args[]) {
		
	LinkedList<Integer> list = new LinkedList<>();
	list.add(10);
	list.add(15); // add(e element) is used to add the new elements at the end of the list.
	list.add(20);
	list.add(25);
	list.add(30);
	list.add(5,35);//add(int index,obj ele) method is used to add the new element at specified position of the index in the list.
	System.out.println("list the elements :"+list);
	
	list.addFirst(5); //addFirst() method insert the specified  element at the beginning of the list.
	list.addLast(40); //addLast() method insert the specified element at the end of the list.
	System.out.println(list);
	
	list.set(0,3); //set(int index,ele) method is used to replace the element from the specified position in the i list with specified ele.
	System.out.println(list);
	
	list.get(1);  // get(int index) method is used to return the specified position of the element in the list.
	System.out.println(list.get(1));
	
	list.getFirst(); //getFirst() method is used to return the first element from the list 
	System.out.println(list.getFirst());
	
	list.getLast();//getLast() method is used to return the last  element from the list
	System.out.println(list.getLast());
	
	System.out.println(list.remove(5)); //remove(int index) this method removes the element from the specified position in the list.
	System.out.println(list.remove());
	System.out.println(list);
	//System.out.println(list.remove(10));
	
	
	
	
		
	}

}
