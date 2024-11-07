package com.java.practice.Linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> s1 = new LinkedList<>();
		s1.add("list");
		s1.add("interface");
		s1.add("implements");
		s1.add("child");
		s1.add("interface");
		s1.add("class");
		//System.out.println(s1);
		LinkedList<String> s2 = new LinkedList<>();
		s2.add("list interface");
		s2.add("implements");
		s2.add("Arraylist");
		s2.add("linkedlist child classes");
		s1.addAll(s2);
		System.out.println(s1);
		
		s1.removeAll(s2);
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.containsAll(s2));
		
		System.out.println(s1.containsAll(s1));
		
		System.out.println(s1.contains("implements"));
		
		System.out.println(s1.size());
		
		s1.clear();
		System.out.println(s1);
		
		System.out.println(s1.isEmpty());
		
		System.out.println(s1.poll());
		System.out.println(s2.peek());
		
		System.out.println(s2.poll());
		
		System.out.println(s2.peek());
		
		System.out.println(s2.peekFirst());
		
		System.out.println(s2.peekLast());
		
		System.out.println(s1.peekLast());
		
		System.out.println(s2);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
