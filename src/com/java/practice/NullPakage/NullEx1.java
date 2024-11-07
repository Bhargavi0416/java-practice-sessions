package com.java.practice.NullPakage;

import java.util.*;
public class NullEx1 {

	public static void main(String[] args) {
		Queue<String> s = new LinkedList<>();
		
		s.add(null);
		s.add(null);
		System.out.println(s);//[null, null]
		
		Queue<Character> c = new PriorityQueue<>();
		c.add(null);//java.lang.NullPointerException
	//	c.addAll(null); //java.lang.NullPointerException
		//System.out.println(c);
		
		PriorityQueue<Float> pq = new  PriorityQueue<>();
		pq.add(null);
		System.out.println(pq);//Exception in thread "main" java.lang.NullPointerException
		
		Deque<Integer> dq = new ArrayDeque<>();
		dq.add(null);
		System.out.println(dq);//java.lang.NullPointerException
		
		
		ArrayDeque<Short> adq = new ArrayDeque<>();
		adq.addFirst(null);
		System.out.println(adq); //java.lang.NullPointerException
		
		
		
		// TODO Auto-generated method stub

	}

}
