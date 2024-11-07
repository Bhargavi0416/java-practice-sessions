package com.java.practice.Stack.queue;

import java.util.Queue;
import java.util.LinkedList;

public class TestQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.offer(20);
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println(q);
		
		System.out.println("removed element from queue :"+q.poll());
		
		System.out.println(q.peek());
		
		System.out.println(q.remove());
		
		System.out.println(q.isEmpty());
		
		System.out.println(q.removeAll(q));
		
		System.out.println("Queue is empty :"+q.isEmpty());
		
		Queue<Character> ch = new LinkedList<>();
		
	    ch.offer('q');
		ch.offer('u');
		ch.offer('e');
		ch.offer('z');
		ch.offer('e');
		System.out.println(ch);
		
		System.out.println(ch.contains('u'));
		
		//ch.LastIndexOf('u');
		System.out.println(ch.remove());
		
		
		
		System.out.println(ch.remove(2));
		
		System.out.println(ch);
		
		//ch.set(5,'a');
		//ch.get(4);
//		System.out.println(ch.element());
		
//		System.out.println(ch.size());
		
		//ch.containsAll(q);
//		System.out.println(q.containsAll(ch));
		
//		System.out.println(ch.containsAll(q));
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
