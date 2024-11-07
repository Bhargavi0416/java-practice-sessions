package com.java.practice.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
public class DeQEx {

	public static void main(String[] args) {
		Deque<String> s1 = new ArrayDeque<>();
		s1.add("collection interface");
		s1.add("extends");
		s1.add("queue interfece");
		s1.add("queue interface");
		s1.add("implements");
		s1.add("priority queue");
		s1.add("Linkedlist");
		s1.add("Deque extends queue");
		s1.addLast("dequeue implements Arraydeque,Linkedlist");
		System.out.println(s1);
		
		System.out.println(s1.toString());
		
		System.out.println(s1.toArray());
		
		System.out.println(s1.equals(s1));
		
		System.out.println(s1.contains("queue "));
		
		System.out.println(s1.containsAll(s1));
		
		System.out.println(s1.removeAll(s1));
		
		System.out.println(s1.isEmpty());
		
		System.out.println(s1);
		
		ArrayDeque<String> s = new ArrayDeque<>();
		
		System.out.println(s1.equals(s));

		//System.out.println(s1.containsAll(s));
		// TODO Auto-generated method stub

	}

}
