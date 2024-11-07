package com.java.practice.Queue;

import java.util.PriorityQueue;

public class PQueueEx3 {

	public static void main(String[] args) {
		PriorityQueue<String> str = new PriorityQueue<>();
		str.add("d");
		str.add("f");
		str.add("a");
		str.add("h");
		str.add("c");
		str.add("b");
		str.add("g");
		str.add("e");
		System.out.println(str);
		PriorityQueue<String> s = new PriorityQueue<>();
		s.add("p");
		s.add("q");
		s.add("w");
		s.add("y");
		s.add("z");
		s.add("a");
		s.add("b");
		System.out.println(s);
		
		System.out.println(s.poll());
		
		s.add("d");
		System.out.println(s);
		
		
		// TODO Auto-generated method stub

	}

}
