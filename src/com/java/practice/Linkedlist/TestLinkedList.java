package com.java.practice.Linkedlist;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
	LinkedList<String> str = new LinkedList<String>();
	str.add("List");
	str.add("interface");
	str.add("implements");
	str.add("Linked");
	str.add("List");
	str.add("child");
	str.add("class");
	System.out.println(str);
		
	str.offer("in collections"); //offer(obj ele)method is used to add the specified  element as the last element(tail) in the list
	System.out.println(str);
		
	str.offerFirst("Collection interface extends");//offerFirst(obj E) method  Inserts the specified element at the front of this list
	System.out.println(str);
	
	str.offerLast("framework");//offerLast(obj E)This method Inserts the specified element at the end of this list
	System.out.println(str);//
	
	str.poll();// poll() method retrieves and removes the head (first element) of this list.
	System.out.println(str);
	
	str.pollFirst(); //This method retrieves and removes the first element of this list, or returns null if this list is empty.
	System.out.println(str);
	
	str.pollLast(); //This method retrieves and removes the last element of this list, or returns null if this list is empty.
	System.out.println(str);
	
	str.remove(); //This method retrieves and removes the head (first element) of this list
	System.out.println(str);
	
	//str.indexOf("List");
	System.out.println(str.indexOf("List"));
	
	System.out.println(str.indexOf("parent"));
	
	
	System.out.println(str.lastIndexOf("in collections"));
	
	System.out.println(str.element());//This method retrieves but does not remove, the head (first element) of this list.
	
	
		// TODO Auto-generated method stub

	}

}
