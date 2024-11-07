package com.java.practice.Linkedlist;	

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
	LinkedList<Character> c1 = new LinkedList<>();
	c1.add('A');
	c1.add('B');
	c1.add('C');
	c1.add('D');
	c1.add('E');
	c1.add('F');
	c1.add(3,'d');
	System.out.println(c1);
		
	c1.remove(4);   //remove(int index)method is used to remove the element from the specific position in the linked(list).
	System.out.println(c1);
	    
	//c1.remove('A'); //remove(obj e) method is used to remove the specified element from the specified position in the list.
   // System.out.println(c1.remove('A'));
		
   System.out.println(c1.removeFirst());//removeFirst() method is used to remove the first ele and return the ele from the list
   
   System.out.println(c1);
   c1.removeFirstOccurrence('A'); // This method removes the first occurrence of the specified element in this list and return the boolean value.
   System.out.println(c1.removeFirstOccurrence('A'));
		
  // c1.removeLast();
   System.out.println(c1);
   System.out.println(c1.removeLast());//removeLast() method is used to remove the Last ele and return the   ele from the list
   System.out.println(c1.removeLastOccurrence('E'));//This method removes last occurrence of the specified ele in this list and return the boolean val.
		// TODO Auto-generated method stub
	}

}
